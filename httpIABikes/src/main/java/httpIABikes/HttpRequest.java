package httpIABikes;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpRequest {
    public static void main(String[] args) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Defina o URL do endpoint da sua API de regressão do Azure ML
            String apiUrl = "http://f61e66df-2c13-4525-898a-9a2e28024c52.southcentralus.azurecontainer.io/score";

            // Prepare os dados de entrada em JSON
            String jsonData = "{\r\n"
            		+ "  \"Inputs\": {\r\n"
            		+ "    \"data\": [\r\n"
            		+ "      {\r\n"
            		+ "        \"day\": 1,\r\n"
            		+ "        \"mnth\": 1,\r\n"
            		+ "        \"year\": 2022,\r\n"
            		+ "        \"season\": 2,\r\n"
            		+ "        \"holiday\": 0,\r\n"
            		+ "        \"weekday\": 1,\r\n"
            		+ "        \"workingday\": 1,\r\n"
            		+ "        \"weathersit\": 2,\r\n"
            		+ "        \"temp\": 0.3,\r\n"
            		+ "        \"atemp\": 0.3,\r\n"
            		+ "        \"hum\": 0.3,\r\n"
            		+ "        \"windspeed\": 0.3\r\n"
            		+ "      }\r\n"
            		+ "    ]\r\n"
            		+ "  },\r\n"
            		+ "  \"GlobalParameters\": 1.0\r\n"
            		+ "}\r\n"
            		+ "";

            // Crie uma requisição HTTP POST
            HttpPost request = new HttpPost(apiUrl);

            // Configure o cabeçalho com as credenciais de autenticação
            request.setHeader(HttpHeaders.AUTHORIZATION, "igkc7Pi0bl8X0Yti2JaKDBgAHHlL5cLh");
            request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");

            // Defina os dados de entrada no corpo da requisição
            request.setEntity(new StringEntity(jsonData));

            // Execute a requisição
            HttpResponse response = httpClient.execute(request);

            // Processar a resposta
            if (response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                String responseBody = EntityUtils.toString(entity);
                System.out.println("Resultado da regressão: " + responseBody);
            } else {
                System.err.println("Erro na chamada da API: " + response.getStatusLine().getReasonPhrase());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
