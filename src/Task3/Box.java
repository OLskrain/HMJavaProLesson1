package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> { //обобщенный тип ограниченный сверху Фруктом
    private ArrayList<T> container;
    public ArrayList<T> getContainer(){
        return container;
    }
    public Box(ArrayList<T> container){ //конструктор, в который передается арейлист сразу
        this.container = container;
    }
    public Box(T... fruits){ //конструктор, в который передаеться список. "..."-это список из объектов.неизвестно сколько их
                             //они передаются не массивом и не коллекцией
        this.container = new ArrayList<>(Arrays.asList(fruits)); //наши оттельные объекты укладываем в список
    }
    public void addFruit(T fruit){ //метож для добавления любых фруктов
        this.container.add(fruit);
    }
    public float getWeight(){ //метод для подсчета веса коробки
        float w = 0f;
        for(T t : container){
            w+=t.getWeight();
        }
        return w;
    }
    public boolean weightCompare(Box<?> anotherBox){//метод, который сравнивает вес.<?>-маска,чтобы метод был универсальным
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001f; //с точностью до 1 тысячной
    }
    public void transferFruits(Box<? super T> anotherBox){//метод, который позволяет пересыпать из одной коробки в другую
                                                          //нельзя пересыпать яблоки к апельсинам и наоборот, но можно пересыпать
                                                          //в коробку фруктов, поэтому используем<? superT>- ограничение снизу
        anotherBox.container.addAll(this.container); //без гетконтейнера, потому что это тот же самый класс.есть доступ
        this.container.clear();
    }
    public void info(){
        System.out.println(this.container);
    }
}


