package requests.brand.crud;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetBrand extends TestBase {

    @Test
    public void test_GetBrandsIsSuccess() {

        Response response = RestAssured.get("data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22");

        response.getBody().print();

    }

    @Test
    public void test_GetBrandEmpty() {


    }

}
