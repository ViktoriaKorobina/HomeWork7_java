package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product productOne = new Product("Laptop", 50000, 9.0);
        Product productTwo = new Product("Laptop", 40000, 8.2);
        Product productThree = new Product("Laptop", 45000, 7.0);
        Product productFour = new Product("TV", 50000, 9.7);
        Product productFive = new Product("TV", 60000, 9.8);
        Product productSix = new Product("TV", 30000, 6.6);
        Product productSeven = new Product("Telephone", 50000, 10.0);
        Product productEight = new Product("Telephone", 15000, 7.2);
        Product productNine = new Product("Telephone", 20000, 8.0);
        Product productTen = new Product("Telephone", 25000, 9.1);
        List<Product> list = new ArrayList<>();
        list.addAll(Arrays. asList(productOne, productTwo, productThree,
                productFour, productFive, productSix, productSeven, productEight, productNine, productTen));
        Store store = new Store((ArrayList<Product>) list);
        List<Product> laptop = new ArrayList<>();
        Category categoryOne = new Category((ArrayList<Product>) laptop, "Laptop");
        categoryOne.addProduct(productOne);
        categoryOne.addProduct(productTwo);
        categoryOne.addProduct(productThree);
        System.out.println(categoryOne);
        System.out.println("----------");
        List<Product> tv = new ArrayList<>();
        Category categoryTwo = new Category((ArrayList<Product>) tv, "TV");
        categoryTwo.addProduct(productFour);
        categoryTwo.addProduct(productFive);
        categoryTwo.addProduct(productSix);
        System.out.println(categoryTwo);
        System.out.println("----------");
        List<Product> telephone = new ArrayList<>();
        Category categoryThree = new Category((ArrayList<Product>) telephone, "Telephone");
        categoryThree.addProduct(productSeven);
        categoryThree.addProduct(productEight);
        categoryThree.addProduct(productNine);
        categoryThree.addProduct(productTen);
        System.out.println(categoryThree);
        System.out.println("----------");
        System.out.println(store);
        User firstUser = new User("Vanya", "Vanya1", "fgh345");
        User secondUser = new User("Petya", "Petruha", "l6j4n8");
        Basket firstBasket = new Basket(firstUser);
        firstBasket.addProductInBasket(productOne, store);
        firstBasket.addProductInBasket(productTen, store);
        Basket secondBasket = new Basket(secondUser);
        secondBasket.addProductInBasket(productFive, store);
        System.out.println("-----------");
        System.out.println(firstBasket);
        System.out.println(secondBasket);
        System.out.println("-----------");
        firstBasket.removeProductInBasket(productTen);
        System.out.println(firstBasket);
        firstBasket.purchase(store);
        System.out.println("-----------");
        System.out.println(store);
        secondBasket.purchase(store);
        System.out.println("-----------");
        System.out.println(store);



    }
}