package task1;

public class Main {
    public static void main(String[] args) {
        Integer [] numbers = {45,358,1,-89,187,32,-7,367,7,-666,12,1477,32,6,29,100};
        Collection newCollection = new Collection(numbers);
        Iterator newIterator;

        System.out.println("Array");
        for (int a : numbers){
            System.out.print(a+" ");
        }
        System.out.println();

        System.out.println("Array without odd numbers:");
        newIterator = newCollection.createForward();
        while (newIterator.hasNext()){
            System.out.print(newIterator.next()+" ");
        }
        System.out.println();

        System.out.println("Backward array, every second number");
        newIterator = newCollection.createBackward();
        while (newIterator.hasNext()){
            System.out.print(newIterator.next()+" ");
        }
        System.out.println();

        System.out.println("Backward array, every third odd number");
        newIterator = newCollection.everyThirdOddNumber();
        while (newIterator.hasNext()){
            System.out.print(newIterator.next()+" ");
        }
        System.out.println();

        System.out.println("Array, every fifth number, even numbers are reduce to 100");
        newIterator = newCollection.everyFifthNumber();
        while (newIterator.hasNext()){
            System.out.print(newIterator.next()+" ");
        }
        System.out.println();

        System.out.println("Array, every second number is odd");
        newIterator = Collection.createAllSecondNumbersOdd();
        while (newIterator.hasNext()){
            System.out.print(newIterator.next()+" ");
        }
    }
}
