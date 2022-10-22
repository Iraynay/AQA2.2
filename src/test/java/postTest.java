import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class postTest {
    @Test
    void shouldReturnCorrectBody(){

// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body ({
                        "currency":"RUB",
                "id":0
        })
// Выполняемые действия
        when()
                .post("/post")
// Проверки
        .then()
                .statusCode(200)
                .body(".currency", equalTo("RUB"))
        ;

    }
            ;
}
