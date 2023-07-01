package ru.gb.vending_machine;

import ru.gb.vending_machine.products.Bottle;
import ru.gb.vending_machine.products.Product;
import ru.gb.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(123);

        //слева - тип ссылки, справа - объект
        Product product1 = new Bottle("coca-cola", 150, 1.5);
        Product product2 = new Product("milko", 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);

        //Проявление полиморфизма:
        //Для объекта product1 (class Bottle) работает функционал toString класса Bottle (выводится объем),
        // хотя формально вызывается метод toString базового класса Product
        //Полиморфизм заключается в том, что
        //каждый класс-наследник по-своему реализует метод, прописанный в базовом классе
        System.out.println(vendingMachine.getProductsInfo());
    }
}
