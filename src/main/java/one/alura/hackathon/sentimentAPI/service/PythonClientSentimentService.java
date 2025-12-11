package one.alura.hackathon.sentimentAPI.service;

import one.alura.hackathon.sentimentAPI.dto.SentimentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.util.Map;

//@Service
public class PythonClientSentimentService implements SentimentService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper = new ObjectMapper();

    @Value("${ds.api.url:http://localhost:8000/predict}")
    private String dsApiUrl;

    @Override
    public SentimentResponse predict(String text) {
        try {
            var body = Map.of("text", text);
            var entity = new HttpEntity<>(body, new HttpHeaders());
            ResponseEntity<String> resp = restTemplate.postForEntity(dsApiUrl, entity, String.class);

            if (resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                JsonNode json = mapper.readTree(resp.getBody());
                String previsao = json.path("previsao").asText();
                double prob = json.path("probabilidade").asDouble();
                return new SentimentResponse(previsao, prob);
            }
            throw new RuntimeException("Erro na integração com DS: status " + resp.getStatusCode());
        } catch (Exception e) {
            // Fallback: neutro, ou lance uma exceção para ser tratada pelo handler global
            throw new RuntimeException("Falha ao chamar o serviço de DS", e);
        }
    }
}
