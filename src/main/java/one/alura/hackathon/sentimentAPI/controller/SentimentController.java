package one.alura.hackathon.sentimentAPI.controller;

import jakarta.validation.Valid;
import one.alura.hackathon.sentimentAPI.dto.SentimentRequest;
import one.alura.hackathon.sentimentAPI.dto.SentimentResponse;
import one.alura.hackathon.sentimentAPI.service.SentimentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SentimentController {

    private static final Logger log = LoggerFactory.getLogger(SentimentController.class);
    private final SentimentService service;

    public SentimentController(@Qualifier("stubSentimentService") SentimentService service) {
        this.service = service;
    }

    @PostMapping("/sentiment")
    public ResponseEntity<SentimentResponse> predict(@Valid @RequestBody SentimentRequest request) {
        log.info("Recebido texto para sentimento (len={}): {}", request.text().length(), request.text());
        var result = service.predict(request.text());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }
}

