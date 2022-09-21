package com.example.controller;

import com.example.domain.Story;
import com.example.repositories.StoryRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;

@Controller("/stories")
public class StoryController {

    @Inject
    StoryRepository repository;

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<Iterable<Story>> getStories() {
        return HttpResponse.ok(repository.findAll());
    }
}
