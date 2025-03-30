package day250330;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4));
        List<Integer> b = a; // 같은 객체를 참조

        b.set(b.size() - 1, 5); // 마지막 요소 변경

        System.out.println(a); // [1, 2, 2, 3, 3, 3, 4, 4, 4, 5]
        System.out.println(b); // [1, 2, 2, 3, 3, 3, 4, 4, 4, 5]
        System.out.println(a == b); // true (같은 객체를 참조)
    }
}
