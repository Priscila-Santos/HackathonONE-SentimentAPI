package one.alura.hackathon.sentimentAPI.service;

import one.alura.hackathon.sentimentAPI.dto.SentimentResponse;
import org.springframework.stereotype.Service;

@Service
public class StubSentimentService implements SentimentService {
    @Override
    public SentimentResponse predict(String text) {
        // Regra simples temporária: se contém "ótimo", "excelente" => positivo; "ruim", "péssimo" => negativo; senão neutro
        var lower = text.toLowerCase();
        if (lower.contains("ótimo") || lower.contains("excelente") || lower.contains("bom")) {
            return new SentimentResponse("Positivo", 0.85);
        } else if (lower.contains("ruim") || lower.contains("péssimo") || lower.contains("atrasado")) {
            return new SentimentResponse("Negativo", 0.82);
        }
        return new SentimentResponse("Neutro", 0.55);
    }
}
