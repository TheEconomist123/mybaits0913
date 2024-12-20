package com.zhouzz.test.ai.mistral;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

public class MistralAIClient {
    // API URL，假设 Mistral 提供了类似 OpenAI 的接口
    private static final String API_URL = "https://api.mistral.ai/v1/generate"; // 示例URL
    private static final String API_KEY = "4TF8n93Z8f20KCfHEokJO8yyetr5b9jj"; // 替换为你的API密钥

    public static void main(String[] args) {
        try {
            // 准备发送到 API 的数据
            JSONObject requestData = new JSONObject();
            requestData.put("model", "mistral-7b"); // 模型名称，假设使用 Mistral 7B
            requestData.put("prompt", "你好，Mistral AI！请生成一段文本。");
            requestData.put("max_tokens", 100); // 生成的最大 token 数量
            requestData.put("temperature", 0.7); // 温度，控制生成的随机性

            // 创建 HTTP 请求
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Authorization", "Bearer " + API_KEY) // API 密钥
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestData.toString(), StandardCharsets.UTF_8))
                    .build();

            // 创建 HTTP 客户端并发送请求
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 处理响应
            if (response.statusCode() == 200) {
                System.out.println("Mistral AI Response: " + response.body());
                JSONObject jsonResponse = new JSONObject(response.body());
                String generatedText = jsonResponse.getString("text"); // 假设返回字段是 "text"
                System.out.println("Generated text: " + generatedText);
            } else {
                System.out.println("Request failed with status code: " + response.statusCode());
                System.out.println("Response body: " + response.body());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
