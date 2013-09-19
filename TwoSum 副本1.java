import java.util.TreeMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
        int length = numbers.length;
        int[] ret = new int[2];
        for(int i=0;i<length;i++){
            if(tm.containsKey(target-numbers[i])){
            	ret[0]=tm.get(target-numbers[i])>i?tm.get(target-numbers[i]):i;
            	ret[1]=tm.get(target-numbers[i])<=i?tm.get(target-numbers[i]):i;
            	return ret;  	
            }else{
            	tm.put(numbers[i], i+1);
            }
        }
        return ret;
    }
}