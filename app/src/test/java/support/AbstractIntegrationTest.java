package support;

import dummy.service.app.Application;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(
        classes = Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public abstract class AbstractIntegrationTest {

    @LocalServerPort
    private int port;

    protected RequestSpecification requestSpecification;

    @BeforeEach
    void setUp() {
        requestSpecification = new RequestSpecBuilder()
                .setPort(port)
                .setContentType(ContentType.JSON)
                .build();
    }
}
