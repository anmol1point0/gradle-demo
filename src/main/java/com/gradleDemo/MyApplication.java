package com.gradleDemo;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

public class MyApplication {

    public JsonNode getData() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
        HttpRequest request = requestFactory
                .buildGetRequest(new GenericUrl("https://jsonplaceholder.typicode.com/todos/1"));
        String response = request.execute().parseAsString();
        return obj.readValue(response, JsonNode.class);
    }

    public static void main(String args[]) {
        // System.out.println("Heyy!!");
    }
}