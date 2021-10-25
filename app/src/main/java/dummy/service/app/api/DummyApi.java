package dummy.service.app.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@RequiredArgsConstructor
public class DummyApi {

    @GetMapping("/instant")
    public Mono<String> getInstant() {
        return Mono.fromCallable(Instant::now)
                .map(it -> "Now is: " + it);
    }
}
