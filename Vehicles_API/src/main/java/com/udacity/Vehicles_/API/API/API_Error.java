package com.udacity.Vehicles_.API.API;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Declares methods to return errors and other messages from the API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class API_Error {

    private final String message;
    private final List<String> errors;

    API_Error(String message, List<String> errors) {
        this.message = message;
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getErrors() {
        return errors;
    }
}
