package com.youyue.zuul;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Component
public class HystrixFallback implements FallbackProvider {
    @Override
    public String getRoute() {
        return "hystrix";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        cause.printStackTrace();
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "hystrix wrong";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                Map<String,String> response = new HashMap<>();
                response.put("error","504");
                return new ByteArrayInputStream(new ObjectMapper().writeValueAsBytes(response));
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON);
                return httpHeaders;
            }
        };
    }
}
