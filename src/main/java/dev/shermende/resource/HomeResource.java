package dev.shermende.resource;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Introspected
public class HomeResource {
    @NotEmpty
    private String name;
}
