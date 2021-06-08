package dev.shermende.controller;

import dev.shermende.model.HomeModel;
import dev.shermende.resource.HomeResource;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import java.util.UUID;

@Slf4j
@Controller
public class HomeController {

    @Post
    public HomeModel post(
            @Valid @Body HomeResource resource
    ) {
        log.info("hello: {}", resource);
        return HomeModel.builder()
                .name(String.format("hello-%s", resource.getName()))
                .uuid(UUID.randomUUID().toString())
                .build();
    }

}
