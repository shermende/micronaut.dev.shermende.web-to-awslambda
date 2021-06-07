package dev.shermende.model;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@Introspected
public class HomeModel {
    @NotEmpty
    private String name;
    @NotEmpty
    private String uuid;
}
