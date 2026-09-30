package com.admin.catalogo.application;

import com.admin.catalogo.domain.category.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UseCaseTest {

    @Test
    public void testExecuteShouldReturnNonNullCategory() {
        final var useCase = new UseCase();

        final var actualResult = useCase.execute();

        assertNotNull(actualResult);
    }

    @Test
    public void testExecuteShouldReturnInstanceOfCategory() {
        final var useCase = new UseCase();

        final var actualResult = useCase.execute();

        assertInstanceOf(Category.class, actualResult);
    }
}
