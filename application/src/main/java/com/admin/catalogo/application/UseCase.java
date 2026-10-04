package com.admin.catalogo.application;

import com.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute(){
        return Category.newCategory("Filmes", "A categoria mais assistida", true);
    }
}