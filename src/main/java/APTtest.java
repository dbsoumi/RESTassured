import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;



public class APTtest {
    @Test 
    void test1(){
        Response response=RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("status Code:"+ response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Push");
    }
}
