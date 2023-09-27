package com.roananik.lessons11;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Product {
    private int indexProduct;
    private String type;
    private double prise;
    private boolean discount;
    private LocalDate addDate;


    //1.2 Реалізувати метод отримання всіх
    // продуктів у вигляді списку, категорія яких еквівалентна “Book” та ціна більш ніж 250.

    public List<Product> getAllAbovePrise(List<Product> products, String type, double limitPrise) {


    }


    //2.2 Реалізувати метод отримання всіх продуктів як списку, категорія яких еквівалентна
    // “Book” і з можливістю застосування знижки. Фінальний список повинен містити продукти
    // з застосованою знижкою 10%.

    public List<Product> getDiscount(List<Product> products, String type, int discountPercentage) {

    }

    //3.2 Реалізувати метод отримання найдешевшого продукту з категорії “Book”
//3.3 У випадку, якщо жоден продукт не знайдено (ситуація, коли немає продукту з категорією),
// викинути виняток з повідомленням “Продукт [категорія: ім'я_категорії] не знайдено”.
    public Product getMinPrice(List<Product> products) {


    }


    //4.2 Реалізувати метод отримання трьох останніх доданих продуктів

    public List<Product> getNewestOne(List<Product> products, int count) {

    }

    // Реалізувати метод калькуляції загальної вартості продуктів, які відповідають наступним критеріям:
    //- продукт додано протягом поточного року
    //- продукт має тип “Book”
    //- ціна продукту не перевищує 75

    public double getTotalCostsProduct(List<Product> products, LocalDate desire, String type, double limitPrise) {


    }


    //** 6.2 Реалізувати метод групування об'єктів за типом продукту. Таким чином результатом виконання методу
    //буде тип даних “Словник”, що зберігає пару ключ-значення: {тип: список_продуктів}
    public Map<String, List<Product>> getGroupProducts(List<Product> products, String type) {



    }


}
