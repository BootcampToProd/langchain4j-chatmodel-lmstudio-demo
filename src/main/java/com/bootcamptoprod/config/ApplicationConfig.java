package com.bootcamptoprod.config;

import dev.langchain4j.http.client.jdk.JdkHttpClient;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class ApplicationConfig {

    @Bean
    public OpenAiChatModel chatModel() {

        // Configure underlying JDK HTTP client for LM Studio
        HttpClient.Builder jdkBuilder = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1); // Force HTTP/1.1 for LM Studio

        // Build OpenAI-compatible chat model pointing to LM Studio
        return OpenAiChatModel.builder()
                .apiKey("lm-studio") // Any API key value
                .modelName("google/gemma-3-1b") // Model served by LM Studio
                .baseUrl("http://localhost:1234/v1") // LM Studio OpenAI-compatible endpoint
                .httpClientBuilder(
                        JdkHttpClient.builder()
                                .httpClientBuilder(jdkBuilder) // Inject custom HTTP client
                )
                .logRequests(true) // Enable logging to see requests
                .logResponses(true) // Enable logging to see responses
                .build();
    }
}