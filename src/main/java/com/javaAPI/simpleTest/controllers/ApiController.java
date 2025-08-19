package com.javaAPI.simpleTest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/process")
    public ResponseEntity<String> processJson (@RequestBody Map<String, Object> jsonData) {
        System.out.println("Json Recebido: " + jsonData);

        String largeText = generateLargeText();

        return ResponseEntity.ok(largeText);
    }

    private String generateLargeText() {

        return """
            Here is a concise daily summary for the user on 2015-11-23:
            Afternoon (12:00-17:00)
            * The user spent a significant amount of time at school, with multiple periods of sitting, talking, and being in a meeting.
            * They were mostly indoors during this time, with some moments of standing and interacting with friends.
            * The user had their phone on the table for a brief period and occasionally had it in their hand.
            Notable Activities:
            * The user attended a meeting that lasted for about 43 minutes (15:00-15:59 and 16:00-16:59).
            * They spent around 55 minutes sitting during the afternoon.
            * There were multiple instances of talking, totaling around 48 minutes.
            Evening (17:00-22:00)
            * The user continued to be at school, with some time spent walking (1 minute) and using the elevator (3 minutes).
            * They took a 5-minute break to use the toilet.
            * The user had their phone in their pocket for a significant amount of time (6 minutes) and occasionally had it in their hand (3 minutes).
            Patterns and Insights:
            * The user had a busy afternoon with multiple activities, including a meeting, sitting, talking, and socializing with friends.
            * They spent a significant amount of time indoors, mostly at school.
            * The user had their phone with them throughout the day, with various instances of using it or having it nearby.
            * There was a brief period of physical activity (walking) in the evening, but overall, the user was mostly sedentary during the day.
            Duration Summary:
            * Total sitting time: 55 minutes
            * Total talking time: 48 minutes
            * Total time at school: approximately 2 hours and 18 minutes
            * Total time indoors: approximately 2 hours and 36 minutes.
            """;
    }
}
