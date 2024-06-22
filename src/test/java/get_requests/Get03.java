package get_requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Get03 {
    /*
        Given
            https://petstore.swagger.io/v2/pet/313
        When
            Kullanıcı URL'e bir GET request gönderir
        Then
            HTTP Status Code 200 olmalı
        And
            Content Type "application/json" olmalı
        And
            "name" şu metni içermeli: "Tekir",
        And
            "status" değeri "available" olmalı
        And
            "category" altındaki "name" değeri "CAT" olmalı
        And
            "tags" altındaki ilk datanin "name" değeri "bird" olmalı
     */


    @Test
    public void test01() {
        //1) Set the URL
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.basePath = "/pet/313";
        //2) Set the expected data
        //3) Send the request and get the response
        //4) Do assertion
        given()
                .when()
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("name", containsString("Tekir"))
                .body("status", equalTo("available"))
                .body("category.name", equalTo("CAT"))
                .body("tags[0].name", equalTo("bird"))
                .log().all();
        ;


    }
}