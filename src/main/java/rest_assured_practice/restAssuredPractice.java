package rest_assured_practice;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class restAssuredPractice {

    @Test
    public void sendGetRequest(){
       Response response = get("https://reqres.in/api/users?page=2");
       // printing beautifully response in console
       System.out.println(response.prettyPrint());

    }
}
