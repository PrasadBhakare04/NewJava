package _8OptionalClass;

import java.util.*;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Prasad", "John", "Doex");
        
        Optional<String> s = list.stream().filter(str -> str.contains("x")).findFirst();
        String res = s.orElse("Not found");
        System.out.println(res);

        String n = list.stream().filter(str -> str.contains("x")).findFirst().orElse("Not found");
    }
}
