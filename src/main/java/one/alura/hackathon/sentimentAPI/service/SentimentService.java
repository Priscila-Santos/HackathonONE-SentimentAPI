package one.alura.hackathon.sentimentAPI.service;

import one.alura.hackathon.sentimentAPI.dto.SentimentResponse;
import org.springframework.stereotype.Service;

@Service
public interface SentimentService {
    SentimentResponse predict(String text);
}

