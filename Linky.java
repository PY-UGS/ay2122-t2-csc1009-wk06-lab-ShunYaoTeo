import java.util.*;

public class Linky {

    public Linky(){}

    public void addAndSort(LinkedList<Integer>list, int value){
        System.out.println("Before: " + list);
        list.add(value);
        Collections.sort(list);
        System.out.println("After: " + list);
    }


    public void swapValues(LinkedList<Integer>list, int indexOne, int indexTwo){

        int temp = list.get(indexOne);
        System.out.println("\nBefore: " + list);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, temp);
        System.out.println("After: " + list);

    }

    public String findValue(LinkedList<Integer>list, int searchVal) {

        for(int i=0 ; i<500; i++){
            if (list.get(i) == searchVal) {

                return "Found! Located at position: "+ i;

            }

        }

        return "-1" ;

    }



    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        LinkedList<Integer> randomList = new LinkedList<Integer>();
        Random random = new Random();
        int randomNumber = random.nextInt(1000,9999);
        for (int i = 0; i < 500; i++) {
            randomList.add(i, random.nextInt(1000, 9999));
        }

        Linky test = new Linky();

        test.addAndSort(ll, 2);
        test.swapValues(ll,2, 5);
        System.out.println(test.findValue(randomList, randomNumber));




    }
}
