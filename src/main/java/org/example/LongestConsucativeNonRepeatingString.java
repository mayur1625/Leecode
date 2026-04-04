package org.example;

public class LongestConsucativeNonRepeatingString {

    public static void main(String[] args) {

        String s = "ABBCEFDACFZX";


        int start = 0, maxLen = 0;
        String result = "";
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            System.out.println("Character : " + c);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;

                System.out.println("Start: " + start + ", x: "+ map.get(c));
            }

            map.put(c, end);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                result = s.substring(start, end + 1);

                System.out.println("Max: "+ maxLen);
                System.out.println("Result: "+ result);
            }

            System.out.println("Map: "+map );
        }

        System.out.println(result);
    }

}
