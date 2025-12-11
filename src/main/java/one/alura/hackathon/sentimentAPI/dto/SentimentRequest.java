package one.alura.hackathon.sentimentAPI.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SentimentRequest(
        @NotBlank(message = "text é obrigatório")
        @Size(min = 5, message = "text deve ter pelo menos 5 caracteres")
        String text
) {}

