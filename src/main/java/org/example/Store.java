package org.example;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> catalog;

    public Store(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<Product> getCatalog() {
        return catalog;
    }

    /**
     * @apiNote Метод удаляет из каталога магазина товары, положенные в корзину
     * @param product корзина
     * @return новый каталог
     */
    public ArrayList<Product> removeProduct(Product product){
        catalog.remove(product);
        return catalog;
    }
    public ArrayList<Product> addProduct(Product product){
        catalog.add(product);
        return catalog;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Product product: catalog){
            str.append(product);
        }
        return str.toString();
    }


}
