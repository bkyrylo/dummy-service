package dummy.service.app.api;

import org.junit.jupiter.api.Test;
import support.AbstractIntegrationTest;
import static io.restassured.RestAssured.given;

class HealthTest extends AbstractIntegrationTest {

    @Test
    void shouldReturnHttpOkResponse() {
        given(requestSpecification)
                .when()
                .get("/health")
                .then()
                .statusCode(200);
    }
}
