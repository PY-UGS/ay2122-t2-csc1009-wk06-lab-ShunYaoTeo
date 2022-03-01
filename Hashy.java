import java.util.*;

public class Hashy {
    public void addAndSort(HashMap<Integer,Integer> hash, int value ){
        System.out.println("Before: " + hash);
      /*  HashMap<Integer,Integer> temp = new HashMap<>();
        ArrayList<Integer> sortedKeys = new ArrayList<>(hash.keySet());
        sortedKeys.add(value);
        Collections.sort(sortedKeys);
        for(Integer x: sortedKeys){
            temp.put(x,null);
        }
        hash.putAll(temp);/ */
        hash.put(value,null);
        System.out.println(("After: " + hash));
    }

    public void swapValues(HashMap<Integer,Integer> hash, int indexOne, int indexTwo){
        System.out.println("Before: " + hash);
        HashMap<Integer,Integer> temp = new HashMap<>();
        ArrayList<Integer> swapKeys = new ArrayList<>(hash.keySet());
        Collections.swap(swapKeys, indexOne, indexTwo);
        for(Integer x: swapKeys){
            temp.put(x,null);
        }
        hash.putAll(temp);
        System.out.println(("After: " + hash.keySet()));
    }

    public String findValue(HashMap<Integer,Integer> hash, int searchVal){
        ArrayList<Integer> keySearch = new ArrayList<>(hash.keySet());
        for(int i=0;i<500;i++){
            if(keySearch.get(i) == searchVal){
                return "Value found at position: " + i;
            }
            else{
                return "-1";
            }
        }
        return "0";
    }


    public static void main(String[] args){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(1,null);
        hm.put(3,null);
        hm.put(5,null);
        hm.put(7,null);
        hm.put(9,null);
        hm.put(11,null);

        HashMap<Integer,Integer> randomList = new  HashMap<Integer,Integer>();
        Random random = new Random();
        int randomNumber = random.nextInt(1000,9999);
        for (int i = 0; i < 500; i++) {
            randomList.put(random.nextInt(1000, 9999),null);
        }

        Hashy test = new Hashy();

        test.addAndSort(hm, 2);
        test.swapValues(hm,2, 5);
        System.out.println(test.findValue(randomList, randomNumber));

    }


}

