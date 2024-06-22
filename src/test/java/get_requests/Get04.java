package get_requests;

import baseUrl.PetStoreBaseUrl;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class Get04 extends PetStoreBaseUrl {
        /*
        Given
            https://petstore.swagger.io/v2/pet/313
        When
            Kullanıcı URL'e bir GET request gönderir
        Then
            HTTP Status Code 200 olmalı
        And
            Content Type "application/json" olmalı
    */

    @Test
    public void test01() {
        //Set the URL
        spec.pathParams("first", "pet", "second", 580);
        //Set the expected data
        //Send the request and get the response

        //Do assertion
        given(spec)
                .when()
                .get("/{first}/{second}")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON);



    }
}