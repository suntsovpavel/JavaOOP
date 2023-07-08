package zoo;

import java.util.ArrayList;
import java.util.List;

//!!! Класс ZooNoise никак не связан с классом Animals, а только с интерфейсом Speakable
// Это называется 'слабая связь'
public class ZooNoise {
    //Интерфейсы можно использовать как абстрацию, здесь: Speakable
    private List<Speakable> noise;

    public ZooNoise() {
        noise = new ArrayList<>();
        noise.add(new Dog());
        noise.add(new Cat());
        noise.add(new Radio());
    }

    public void speakAll(){
        for (Speakable speakable: noise){
            speakable.speak();
        }
    }
}
