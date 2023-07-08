package zoo;

//Интерфейс = договор, контракт
//Здесь перечисляются методы, которые обязан будет реализовать сторонний класс
//Только методы, никаких полей
public interface Speakable {
    void speak();
}

//!!! Разница между интерфейсом и абстрактным классом:
//1. Абстрактный класс может содержать обычные поля и методы
//2. Наследоваться можно от многих интерфейсов, но только от одного абстрактного класса
