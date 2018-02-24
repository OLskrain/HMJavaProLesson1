
public class Task1<T> {
    private T[] array;
    private T y ;

    public Task1(T[] array) {
        this.array = array;
    }
    public void substitution(int z, int x){
        y = array[z];
         array[z] = array [x];
         array[x] = y;
        for (T anArray : array) {
            System.out.print(anArray + " ");
        }

    }
}
