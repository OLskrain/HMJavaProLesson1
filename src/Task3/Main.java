package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>(new Apple(), new Apple()); //передаем отдельными объектами
        Box<Orange> orangeBox = new Box<Orange>(new Orange(), new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<Orange>(new Orange(), new Orange());
        System.out.println(orangeBox.weightCompare(appleBox));
//        orangeBox.transferFruits(appleBox);
        orangeBox.transferFruits(orangeBox2);
        orangeBox2.info();
        orangeBox.info();
        Box<Fruit> fruitBox = new Box<Fruit>(new Apple(), new Orange());
        orangeBox2.transferFruits(fruitBox);
        appleBox.transferFruits(fruitBox);
        orangeBox2.info();
        appleBox.info();
        fruitBox.info();
    }
    //Task 1 (замена двух элементов массива)
    public static <T> void swapElements(T[] arr, int index1, int index2){//обобщение здесь, чтобы был любой массив.универсальный метод
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    //Task 2 ( перенос одного массива в ArrayList<E>)
    public static <T>ArrayList<T> arrayToList(T[] arr) { // T[] - массив любого типа
        return new ArrayList<>(Arrays.asList(arr)); }
}
