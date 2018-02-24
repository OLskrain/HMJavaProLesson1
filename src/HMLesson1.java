/**
 * Java3. Home work 1.
 * @author Ievlev Andrey
 * @version 22 Fab, 2018
 * @Link
*/

public class HMLesson1 {
    public static void main(String[] args) {
        //Task 1
Task1<Integer> nums = new Task1<>(new Integer[]{1,2,3,4,5});
nums.substitution(1,4);
System.out.println(" ");

Task1<String> str = new Task1<>(new String[]{"Привет","Омлет", "Утро"});
str.substitution(0,2);
System.out.println(" ");


        //Task 2
Tack2<Integer> nums2 = new Tack2<>(new Integer[]{6,7,8,9,10});
nums2.transformation();
System.out.println(" ");

Tack2<Double> doub = new Tack2<>(new Double[]{1.23,1.34,1.65,1.75,1.34});
doub.transformation();
    }
}
