package com.source.it.lecture9.exemples.homework;

import java.util.*;

public class AnagramSorter {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("done", "none", "node", "neno", "onion", "deno", "gram", "ramg", "nioon");

       /* String s = "bbaacxzaADR";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);*/
        Map<String, String> map = new LinkedHashMap<>();
        String[] words = new String[strings.size()];
        for ( int i = 0; i< strings.size(); i++) {
            words[i] = strings.get(i);
        }
        for(int i = 0; i <= words.length - 1; i++){
            String tmpWord = words[i];
            char [] sym = words[i].toCharArray();

            Arrays.sort(sym);

            String wordkey = new String(sym);

            String value = map.get(wordkey);
            if(value == null){
                map.put(wordkey, tmpWord );
            }else{
                map.put(wordkey, value + " " + tmpWord);
            }
        }
        /*for (int i = 0; i < strings.size(); i++){

            for (int j = i+1; j < strings.size(); j++){
                 String s = strings.get(i);
                 String s1 = strings.get(j);
                char[]chars = s.toCharArray();
                char[]char1 = s1.toCharArray();
                Arrays.sort(chars);
                Arrays.sort(char1);
                if (String.valueOf(chars).equals(String.valueOf(char1))){
                    //System.out.println(" " + s + " " + s1);
                    map.put(s,s + " " + s1);
                }

            }
        }*/
        for(String k2 : map.values()){
            System.out.println(k2);
        }

    }

}
