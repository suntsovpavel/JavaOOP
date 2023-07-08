package zoo;

import java.io.Serializable;

//1. Нельзя создавать объекты абстрактного класса
//2. Абстрактный класс может содержать абстрактные методы,
//назначение которых - указать потомкам, что данный метод необходимо реализовать
//3. Абстрактный класс не обязан реализовывать методы интерфейса, если он у него имеется (здесь Speakable)
public abstract class Animal implements Speakable {
    private String name;

    public String getName() {
        return name;
    }
}
