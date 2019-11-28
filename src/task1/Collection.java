package task1;

public class Collection {
    static Number [] arr;

    public Collection(Number[] arr) {
        this.arr = arr;
    }

    public class Forward implements Iterator{

        int count=0;

        @Override
        public boolean hasNext() {
            return count<arr.length;
        }

        @Override
        public Object next() {
            if ((int) arr[count] % 2 == 1 || (int) arr[count] % 2 == -1) {
                count++;
                return 0;
            } else {
                return arr[count++];
            }
        }
    }
    public Forward createForward(){
        return new Forward();
    }

    public class Backward implements Iterator{

        int count = arr.length-1;

        @Override
        public boolean hasNext() {
            return count>=0;
        }

        @Override
        public Object next() {
            int returnNumber = count;
            count-=2;
            return arr[returnNumber];
        }
    }
    public Backward createBackward(){
        return new Backward();
    }

    public Iterator everyThirdOddNumber(){
        return new Iterator() {

            int count = arr.length-1;
            int returnNumber;

            @Override
            public boolean hasNext() {
                return count>=0;
            }

            @Override
            public Object next() {
                returnNumber=count;
                count-=3;
                if ((int)arr[returnNumber]%2==1||(int)arr[returnNumber]%2==-1){
                    return arr[returnNumber];
                } else {
                    return "";
                }
            }
        };

    }

    public Iterator everyFifthNumber(){
        class newLocalIterator implements Iterator{

            int count = 0;
            int returnNumber;

            @Override
            public boolean hasNext() {
                return count<arr.length;
            }

            @Override
            public Object next() {
                returnNumber = count;
                count+=5;
                if ((int)arr[returnNumber]%2==0){
                    return (int)arr[returnNumber]-100;
                } else {
                    return arr[returnNumber];
                }
            }
        }
        return new newLocalIterator();
    }

    static class AllSecondNumbersOdd implements Iterator{

        int count = 0;
        int returnIndex;
        int returnNumber;

        @Override
        public boolean hasNext() {
            return count<arr.length;
        }

        @Override
        public Object next() {
            returnIndex=count;
            count++;
            if (returnIndex%2!=0) {
                if ((int) arr[returnIndex] % 2 == 0) {
                    returnNumber = (int) arr[returnIndex] + 1;
                    return returnNumber;
                } else {
                    return arr[returnIndex];
                }
            } else {
                return arr[returnIndex];
            }
        }
    }
    public static AllSecondNumbersOdd createAllSecondNumbersOdd(){
        return new AllSecondNumbersOdd();
    }
}
