package com.banking.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class AccountInput {

    @NotBlank
    private final String name;

    @JsonCreator
    public AccountInput(@NotBlank @JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
