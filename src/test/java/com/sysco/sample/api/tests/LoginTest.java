package com.sysco.sample.api.tests;

import com.jayway.restassured.response.Response;
import com.sysco.sample.api.requests.functions.Project;
import com.sysco.sample.api.response.model.EmployeeGridRes;
import com.sysco.sample.api.util.ResponseUtil;
import com.sysco.sample.api.util.TestBase;
import org.json.JSONException;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {

    private static SoftAssert softAssert;

    @BeforeClass
    public static void initiate(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test(description = "ID-001", alwaysRun = true)
    public static void testEmployeeGridData() throws JSONException {

        softAssert = new SoftAssert();
        Response projectList = Project.getEmployeeGridData();
        EmployeeGridRes  employeeGridRes = (EmployeeGridRes)ResponseUtil.getObject(projectList.asString(), EmployeeGridRes.class);
        softAssert.assertEquals(employeeGridRes.status, "success", "Status is failed");
        softAssert.assertEquals(employeeGridRes.data.get(0).id, "1", "Employee ID is incorrect");
        softAssert.assertEquals(employeeGridRes.data.get(0).employeeName, "Tiger Nixon", "Employee name is incorrect");
        softAssert.assertEquals(employeeGridRes.data.get(0).employeeSalary, "320800", "Employee salary it incorrect");
        softAssert.assertEquals(employeeGridRes.data.get(0).employeeAge, "61", "Employee age is incorrect");
        softAssert.assertEquals(employeeGridRes.data.get(0).profileImage, "", "profile image not loaded");

        softAssert.assertAll();

    }

}
