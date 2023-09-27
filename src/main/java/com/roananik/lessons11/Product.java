package com.roananik.lessons11;

import java.time.LocalDate;
import java.util.*;

public class Product {
    private final String type;
    private double prise;
    private boolean discount;
    private LocalDate addDate;

    public Product(String type, double prise, boolean discount, LocalDate addDate) {
        this.type = type;
        this.prise = prise;
        this.discount = discount;
        this.addDate = addDate;
    }

    public String getType() {
        return type;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }


    //1.2 Реалізувати метод отримання всіх
    // продуктів у вигляді списку, категорія яких еквівалентна “Book” та ціна більш ніж 250.

    public static List<Product> getAllAbovePrise(List<Product> products, String type, double limitPrise) {
        return products.stream()
                .filter(p -> p.getType().equals(type))
                .filter(p -> p.getPrise() > limitPrise)
                .toList();


    }


    //2.2 Реалізувати метод отримання всіх продуктів як списку, категорія яких еквівалентна
    // “Book” і з можливістю застосування знижки. Фінальний список повинен містити продукти
    // з застосованою знижкою 10%.

    public static List<Product> getDiscount(List<Product> products, String type, int discountPercentage) {
        return products.stream()
                .filter(p -> p.getType().equals(type))
                .filter(p -> p.isDiscount() == true)
                .map(p -> new Product(p.getType(), p.getPrise() - (p.getPrise() * ((double) discountPercentage / 100)),
                        false, p.getAddDate()))
                .toList();
    }

    //3.2 Реалізувати метод отримання найдешевшого продукту з категорії “Book”
//3.3 У випадку, якщо жоден продукт не знайдено (ситуація, коли немає продукту з категорією),
// викинути виняток з повідомленням “Продукт [категорія: ім'я_категорії] не знайдено”.
    public Product getMinPrice(List<Product> products, String type) {
        Optional<Product> cheapProduct = products.stream()
                .filter(p -> p.getType().equals(type))
                .min(Comparator.comparingDouble(Product::getPrise));
        return cheapProduct.isPresent()? cheapProduct.get():
                new Product("null",0.0,false,LocalDate.of(1970,1,1));

    }


    //4.2 Реалізувати метод отримання трьох останніх доданих продуктів

    public List<Product> getNewestOne(List<Product> products, int count) {
        return null;
    }

    // Реалізувати метод калькуляції загальної вартості продуктів, які відповідають наступним критеріям:
    //- продукт додано протягом поточного року
    //- продукт має тип “Book”
    //- ціна продукту не перевищує 75

    public double getTotalCostsProduct(List<Product> products, LocalDate desire, String type, double limitPrise) {
        return 0;

    }


    //** 6.2 Реалізувати метод групування об'єктів за типом продукту. Таким чином результатом виконання методу
    //буде тип даних “Словник”, що зберігає пару ключ-значення: {тип: список_продуктів}
    public Map<String, List<Product>> getGroupProducts(List<Product> products, String type) {
        return null;

    }


    @Override
    public String toString() {
        return
                "TYPE: " + type + '.' +
                        " PRICE: " + prise + '.' +
                        " addDATE: " + addDate + '\n';
    }
}
