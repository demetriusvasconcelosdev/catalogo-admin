package com.admin.catalogo.domain.category;

import com.admin.catalogo.domain.validation.ValidationError;
import com.admin.catalogo.domain.validation.ValidationHandler;
import com.admin.catalogo.domain.validation.Validator;

public class CategoryValidator extends Validator {

    public static final int NAME_MAX_LENGTH = 255;
    public static final int NAME_MIN_LENGTH = 3;
    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        final var name = this.category.getName();
        if (name == null) {
            this.validationHandler().append(new ValidationError("'name' should not be null"));
            return;
        }

        if (name.isBlank()) {
            this.validationHandler().append(new ValidationError("'name' should not be empty"));
            return;
        }

        final int length = name.trim().length();
        if (length > NAME_MAX_LENGTH || length < NAME_MIN_LENGTH) {
            this.validationHandler().append(new ValidationError("'name' must be between " + NAME_MIN_LENGTH + " and " + NAME_MAX_LENGTH + " characters"));
        }
    }
}
