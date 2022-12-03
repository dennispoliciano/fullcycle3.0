package com.codeflix.admincatalog.application;

import com.codeflix.admincatalog.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}