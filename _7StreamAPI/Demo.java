//One stream can be used only once as per line 9, 10, 11
package _7StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> s1 = list.parallelStream(); //use when the task is indepent of the values and takes a lot of time
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // s3.forEach(n -> System.out.println(n));

        int result = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        Stream<Integer> s5 = s1.filter(n -> n%2 == 0);
        s5.forEach(n -> System.out.println(n));
    }

}
