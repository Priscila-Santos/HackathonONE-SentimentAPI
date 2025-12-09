# 📌 Lista de Issues – Projeto API de Análise de Sentimentos

Este arquivo contém todas as issues necessárias para organização completa do projeto.  
Clique no link "➕ Criar Issue" ao lado de cada item para criar automaticamente no GitHub.

---

## 🧩 EPIC 1 – Data Science

### 1. Coletar conjunto de dados de sentimentos  
[➕ Criar Issue](../../issues/new?title=Coletar+conjunto+de+dados+de+sentimentos&labels=DS,P1,feature&body=Selecionar+dataset+com+avaliacoes,+comentarios+ou+tweets+para+treinamento+do+modelo.)

### 2. Limpeza e pré-processamento dos textos  
[➕ Criar Issue](../../issues/new?title=Limpeza+e+pre-processamento+dos+textos&labels=DS,P1,feature&body=Remover+stopwords,+pontuacao,+normalizar+lowercase,+limpeza+geral+para+treino.)

### 3. Análise exploratória (EDA)  
[➕ Criar Issue](../../issues/new?title=Analise+Exploratoria+(EDA)&labels=DS,P2,feature&body=Explorar+dados,+visualizar+classes,+frequencias+e+exemplos.)

### 4. Implementar TF-IDF  
[➕ Criar Issue](../../issues/new?title=Implementar+TF-IDF&labels=DS,P1,feature&body=Criar+vetorizador+TF-IDF+e+testar+no+dataset.)

### 5. Treinar modelo supervisionado (Logistic Regression ou Naive Bayes)  
[➕ Criar Issue](../../issues/new?title=Treinar+modelo+supervisionado&labels=DS,P0,feature&body=Treinar+modelo+de+classificacao+de+sentimentos+com+TF-IDF.)

### 6. Avaliar métricas (Acurácia, Precisão, Recall, F1)  
[➕ Criar Issue](../../issues/new?title=Avaliar+metricas+do+modelo&labels=DS,P0,feature&body=Calcular+Acuracia,+Precisao,+Recall+e+F1.)

### 7. Serializar modelo com joblib  
[➕ Criar Issue](../../issues/new?title=Serializar+modelo+com+joblib&labels=DS,P0,feature&body=Salvar+modelo+e+pipeline+em+arquivo+.joblib.)

### 8. Criar Notebook final documentado  
[➕ Criar Issue](../../issues/new?title=Criar+Notebook+final+documentado&labels=DS,DOC,P1&body=Produzir+notebook+com+passo-a-passo+do+modelo.)

---

## 🧩 EPIC 2 – Back-End (API Spring Boot)

### 9. Criar estrutura básica Spring Boot  
[➕ Criar Issue](../../issues/new?title=Criar+projeto+Spring+Boot&labels=BE,P0,feature&body=Gerar+projeto+com+Spring+Web+e+dependencias+basicas.)

### 10. Implementar endpoint POST /sentiment  
[➕ Criar Issue](../../issues/new?title=Implementar+POST+/sentiment&labels=BE,P0,feature&body=Criar+endpoint+que+recebe+JSON+com+campo+text+e+retorna+sentimento.)

### 11. Validar entrada (campo text)  
[➕ Criar Issue](../../issues/new?title=Validar+entrada+text&labels=BE,P0,feature&body=Verificar+tamanho+minimo+e+presenca+de+text.+Retornar+erro+amigavel.)

### 12. Criar resposta JSON padrão  
[➕ Criar Issue](../../issues/new?title=Criar+estrutura+JSON+de+resposta&labels=BE,P0,feature&body=Resposta+deve+conter+previsao+e+probabilidade.)

### 13. Implementar logs e tratamento de erros  
[➕ Criar Issue](../../issues/new?title=Logs+e+tratamento+de+erros&labels=BE,P1,improvement&body=Adicionar+logs,+exceptions+globais+e+respostas+claras.)

---

## 🧩 EPIC 3 – Integração DS + BE

### 14. Criar microserviço Python (FastAPI/Flask) para predição  
[➕ Criar Issue](../../issues/new?title=Criar+microservico+Python+para+predicao&labels=DS,BE,P0,feature&body=Endpoints+para+/predict+retornando+sentimento+e+probabilidade.)

### 15. Integração Spring Boot → microserviço Python  
[➕ Criar Issue](../../issues/new?title=Integrar+Spring+Boot+com+microservico+Python&labels=BE,P0,feature&body=API+Java+deve+enviar+texto+ao+servico+Python+e+receber+predicao.)

---

## 🧩 EPIC 4 – Documentação

### 18. Criar README completo  
[➕ Criar Issue](../../issues/new?title=Criar+README+completo&labels=DOC,P0&body=Instrucoes+de+execucao,+dependencias,+como+testar+o+endpoint+e+documentacao+do+modelo.)

### 19. Exemplos Postman/cURL  
[➕ Criar Issue](../../issues/new?title=Adicionar+exemplos+Postman+e+cURL&labels=DOC,P1&body=Adicionar+3+exemplos+de+uso:+positivo,+neutro,+negativo.)

---

## 🧩 EPIC 5 – Funcionalidades Extras

### 21. Criar endpoint GET /stats  
[➕ Criar Issue](../../issues/new?title=Criar+GET+/stats&labels=EXTRA,P3,feature&body=Retornar+estatisticas+simples+dos+ultimos+comentarios.)

### 22. Persistência de previsões (H2/Postgres)  
[➕ Criar Issue](../../issues/new?title=Persistencia+de+previsoes&labels=EXTRA,BE,P3,feature&body=Salvar+textos+e+previsoes+no+banco+para+analises.)

### 23. Explicabilidade (top features)  
[➕ Criar Issue](../../issues/new?title=Explicabilidade+do+modelo&labels=EXTRA,DS,P3,feature&body=Retornar+palavras+que+mais+influenciam+na+predicao.)

### 24. Interface Streamlit / Web simples  
[➕ Criar Issue](../../issues/new?title=Criar+interface+Streamlit&labels=EXTRA,P3,feature&body=Tela+simples+para+testar+sentimento.)

### 27. Criar Dockerfile e docker-compose  
[➕ Criar Issue](../../issues/new?title=Dockerfile+e+docker-compose&labels=OPS,P2&body=Criar+containers+para+API+Java+e+microservico+Python.)

---

## 🧩 EPIC 6 – Demonstração

### 29. Gravar vídeo da demo  
[➕ Criar Issue](../../issues/new?title=Gravar+video+da+demo&labels=DOC,P2&body=Demonstrar+API+funcionando+com+exemplos.)

### 30. Preparar apresentação final  
[➕ Criar Issue](../../issues/new?title=Preparar+apresentacao+final&labels=DOC,P2&body=Explicar+pipeline,+modelo,+API+e+fluxo+de+predicao.)
