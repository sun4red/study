package newsorting;

import java.util.HashMap;
import java.util.Map;

public class ToSort {
    public int[] generateArray(int max, int length) {

        int[] array = new int[length];

        Map<Integer, Integer> check = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            int num = (int) (Math.random() * max + 1);
            if (check.containsKey(num)) {
                i--;
                continue;
            } else {
                check.put(num, 1);
                array[i] = num;
            }
        }
        return array;
    }
    public void showArray(int[] array){
        String result = "";
        result += "[ ";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if(i < array.length - 1){
                result += " , ";
            }
        }
        result += " ]";

        System.out.println(result);
    }
}
