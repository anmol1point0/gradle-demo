package com.gradleDemoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.gradleDemo.MyApplication;

import org.junit.jupiter.api.Test;

public class MyApplicationTest {

    MyApplication app = new MyApplication();

    @Test
    public void TestData() throws IOException {
        JsonNode node = app.getData();
        assertEquals(node.get("userId").toString(), "1");
    }
}
