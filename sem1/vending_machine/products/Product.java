package ru.gb.vending_machine.products;

public class Product {
    //Модификатор доступа по умолчанию (если было бы просто int id;)
    // говорит о том, что поле видно внутри пакета,
    // в данном случае, во всех файлах директории products, куда входит и данный файл

    //Объявление полей private соответствует принципу инкапсуляции данных
    //Скрываем данные, не давая возможность работать с ними напрямую; только через методы get/set
    //Использование set-методов вместо обращения напрямую к полям позволяет включать различные проверки и т.п.
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price + "р.";
    }
}
