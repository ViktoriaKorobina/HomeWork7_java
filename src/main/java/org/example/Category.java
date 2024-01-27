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
     * @param product товар
     * @return список товаров в категории
     */
    public void addProduct(Product product){
        if(product.getProductName() == getNameCategory()){
            category.add(product);
        }

    }

    private void add(Product product) {
        category.add(product);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product: category){
            stringBuilder.append(product.getProductName());
            stringBuilder.append(": ");
            stringBuilder.append(product.toString());

        }
        return  stringBuilder.toString();
    }
}
