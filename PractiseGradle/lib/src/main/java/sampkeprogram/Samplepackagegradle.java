package sampkeprogram;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Samplepackagegradle {

    @Test
    public void getUsers() {
        Response response = given()
                                .when()
                                .get("https://reqres.in/api/users?page=2");

        int actualStatus = response.statusCode();
        Assert.assertEquals(actualStatus, 200);  // ✅ Integer compared with Integer
    }
}
	


