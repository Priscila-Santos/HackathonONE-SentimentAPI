package one.alura.hackathon.sentimentAPI.dto;

public record SentimentResponse(
        String previsao,
        double probabilidade
) {}

