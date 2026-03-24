package com.health.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PlaceController {

    private final String API_KEY = "AIzaSyC0Pt_J_mamav3TP422vxNxFeNPvkVnvqs";

    @GetMapping("/nearby")
    public String getNearby(
            @RequestParam double lat,
            @RequestParam double lng,
            @RequestParam String type) {

        String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
                + "location=" + lat + "," + lng
                + "&radius=3000"
                + "&type=" + type
                + "&keyword=best"
                + "&key=" + API_KEY;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
