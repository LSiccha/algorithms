package org.example;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Solution solver = new Solution();
        String input = "GaBi 12 E F";
        String output = solver.solve(input);
        System.out.println("INPUT: " + input);
        System.out.println("OUTPUT: " + output);
    }
}

class Solution {
    protected Map<Character, String> map;

    public String solve(String input) {
        ArrayList<Character> chars = new ArrayList<>();
        Character[] charObjectArray = input.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        StringBuilder builder = new StringBuilder();
        for (Character c : charObjectArray) {
            String equivalent = map.get(c);
            if (equivalent != null) {
                builder.append(equivalent);
                continue;
            }
            builder.append(c);
        }
        String respuesta = builder.toString();
        return respuesta;
    }

    Solution() {
        this.map = new HashMap<>();
        map.put('A', ",,*,,,");
        map.put('B', "*,,,,,");
        map.put('C', ",*,*,,");
        map.put('D', ",,*,,,");
        map.put('E', ",,,*,,");
        map.put('F', "*,,,*,");
        map.put('G', ",,*,*,");

        map.put('H', ",,*,,,");
        map.put('I', ",,*,,,");
        map.put('J', ",,*,,,");
        map.put('K', ",,*,,,");
        map.put('L', ",,*,,,");
        map.put('M', ",,*,,,");
        map.put('N', ",,*,,,");
        map.put('O', ",,*,,,");
        map.put('P', ",,*,,,");
        map.put('Q', ",,*,,,");
        map.put('R', ",,*,,,");
        map.put('S', ",,*,,,");
        map.put('T', ",,*,,,");
        map.put('U', ",,*,,,");
        map.put('V', ",,*,,,");
        map.put('W', ",,*,,,");
        map.put('X', ",,*,,,");
        map.put('Y', ",,*,,,");
        map.put('Z', ",,*,,,");
    }
}
