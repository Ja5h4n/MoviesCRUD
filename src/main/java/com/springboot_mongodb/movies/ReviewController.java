package com.springboot_mongodb.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> CreateReview(@RequestBody Map<String, String> requestPayload){
        Review response = new Review();
        response = reviewService.CreateReview(requestPayload.get("reviewBody"), requestPayload.get("imdbId"));
        return new ResponseEntity<Review>(response, HttpStatus.CREATED);
    }
}
