package Task3;

public abstract class Fruit { //здесь делаем класс абстрактным. можем его использовать для различных масок в обобщении
    private float weight; //вес абстрактного фрукта
    public Fruit(float weight){ //конструктор
        this.weight = weight;
    }
    public float getWeight(){ //метод для всех видов фруктов. переопределять не надо
        return weight;
    }
}
