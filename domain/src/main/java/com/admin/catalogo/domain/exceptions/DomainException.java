package com.admin.catalogo.domain.exceptions;

import com.admin.catalogo.domain.validation.ValidationError;

import java.util.List;

public class DomainException extends RuntimeException {

    private final List<ValidationError> errors;

    private DomainException(final List<ValidationError> anErrors) {
        super("", null, true, false);
        this.errors = anErrors;
    }

    public static DomainException with(final ValidationError anError) {
        return new DomainException(List.of(anError));
    }

    public static DomainException with(final List<ValidationError> anErrors) {
        return new DomainException((anErrors));
    }

    public List<ValidationError> getErrors() {
        return errors;
    }
}
