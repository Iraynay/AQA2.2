import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class postTest {
    @Test
    void shouldReturnCorrectBody(){

// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
               .body ("currency")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
        .then()
              .statusCode(200)
                .contentType(ContentType.JSON)
        ;

    }
}
