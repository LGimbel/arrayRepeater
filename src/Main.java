import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static LinkedHashMap<Character,Integer> findCharCountInArray(char[] array){
        LinkedHashMap<Character, Integer> itemQuantity = new LinkedHashMap<>();
        for(char c : array){
            if(itemQuantity.containsKey(c)){
                int tempQuantity = itemQuantity.get(c);
                itemQuantity.put(c,tempQuantity + 1);
            }
            else {
                itemQuantity.put(c,1);
            }
        }
        return itemQuantity;
    }
    public static int[] hashMapToArray(LinkedHashMap<Character,Integer> map){
        int[] array = new int[map.size()];
        int i = 0;
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            int value = entry.getValue();
            array[i] = value;
            i++;
        }
        return array;
    }
    public static int[]findMaxAndMin(int[]array){
        int max = array[0];
        int min = array[0];
        for(int i : array){
            max = Math.max(i, max);
            min = Math.min(i,min);
        }
        int[] minMaxArray = new int[2];
        minMaxArray[0] = max;
        minMaxArray[1] = min;
        return minMaxArray;
    }
    // i am assuming that you mean total unique keys when you ask for this but if you are instead asking for the total amount of duplicates you would just replace the duplicates + 1 with duplicates + i;
    public static int calculateDuplicates(int[] array){
        int duplicates = 0;
        for (int i: array){
            duplicates = i == 1 ? duplicates: duplicates+1;
        }
        return duplicates;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final char[] array = {'a','a','a','b','b','r','r','l'};
        int[] freqencyMap = hashMapToArray(findCharCountInArray(array));
        System.out.println("ordered frequency map:\n"+ Arrays.toString(freqencyMap));
        System.out.println("Min max:" + Arrays.toString(findMaxAndMin(freqencyMap)));
        System.out.println("There are: " +calculateDuplicates(freqencyMap) + " duplicate entries in the string ");
    }
}