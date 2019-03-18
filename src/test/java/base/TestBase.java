package base;

import environments.Environments;
import interfaces.EnvironmentInterface;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class TestBase {

    @BeforeClass
    public static void setup() {

        String env = System.getenv("env");

        EnvironmentInterface envInstance = Environments.getEnv(env);

        RestAssured.baseURI = envInstance.path();

        if (envInstance.port() != 80) {

            RestAssured.port = envInstance.port();

        }

        RestAssured.head("","");

    }

}
