package org.example;

import java.util.ArrayList;

public class Basket extends User{
    private ArrayList<Product> basket;


    public Basket(User user) {
        super(user.getUserName(), user.getLogin(), user.getPassword());
        this.basket = new ArrayList<Product>();
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    /**
     * @apiNote Метод для добавления товара в корзину
     * @param product товар
     * @param catalog каталог магазина
     */
    public void addProductInBasket(Product product, Store catalog){
        if(catalog.getCatalog().contains(product)){
            basket.add(product);
        }
    }

    /**
     * @apiNote Метод для изъятия довара из корзины
     * @param product товар
     * @return
     */
    public void removeProductInBasket(Product product){
        if(basket.contains(product)){
            basket.remove(product);
        }
    }

    /**
     * @apiNote Метод для осуществления покупки
     * @param catalog каталог магазина
     */
    public  void purchase(Store catalog){
        for (Product product: basket){
            catalog.removeProduct(product);

        }
        basket.clear();
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getUserName());
        stringBuilder.append(": ");
        for (Product product: this.getBasket()){
            stringBuilder.append(product.toString());
        }
        return stringBuilder.toString();
    }



}
