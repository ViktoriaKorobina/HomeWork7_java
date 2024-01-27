package org.example;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private ArrayList<Product> category;
    private String nameCategory;

    public Category(ArrayList<Product> category, String nameCategory) {
        this.category = category;
        this.nameCategory = nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    /**
     * @apiNote Метод для добавления товара в категорию
     * @param category категория
     * @param product товар
     * @return список товаров в категории
     */
    public Category addProduct(Category category, Product product){
        if(product.getProductName() == category.getNameCategory()){
            category.add(product);
        }
        return category;
    }

    private void add(Product product) {
        category.add(product);
    }
}
