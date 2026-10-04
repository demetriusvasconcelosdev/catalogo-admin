package com.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(ValidationError anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    List<ValidationError> getErrors();

    default boolean hasError() {
        return !getErrors().isEmpty();
    }

    interface Validation {
        void validate();
    }
}
