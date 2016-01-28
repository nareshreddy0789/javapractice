package com.java.com.java.checksum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by naresh on 1/27/2016.
 */
public class ChkSum{
        public static  int[] twoSum(int[] numbers, int target) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int[] result = new int[2];

            for (int i = 0; i < numbers.length; i++) {
                if (map.containsKey(numbers[i])) {
                    int index = map.get(numbers[i]);
                    result[0] = index+1 ;
                    result[1] = i+1;
                    break;
                } else {
                    map.put(target - numbers[i], i);
                }
            }

            return result;
        }
    public static void main(String args[]){
        int[] chk = {34,34,65,34,23,123,34,54,43};
        int sum = 68;
        System.out.println(Arrays.toString(twoSum(chk, sum)));
    }
    }




