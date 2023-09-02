package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bubble_Sort {
    // 버블정렬
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        int list_length = 0;

        try {
            System.out.println("배열의 크기 입력");
            list_length = Integer.parseInt(br.readLine());
            System.out.println("배열의 크기 : " + list_length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] list = new int[list_length];

        for (int i = 0; i < list_length; i++) {
            list[i] = (int) (Math.random() * list_length + 1);
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (list[i] == list[j]) {
                        i--;
                        break;
                    }
                }
            }
        }
        System.out.println("최초 배열");
        for (int i = 0; i < list_length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println();
        /* ========== 배열 생성 완료 ========== */

        int f = list_length, n = 1, s, count = 0, change = 0;

        for (int a = 0; a + 1 < f; f--) {
            s = 1;
            while (a + 1 < f) {
                System.out.print("[" + n + "회전-" + s + "차]");
                if (list[a] > list[a + 1]) {
                    int temp = list[a + 1];
                    list[a + 1] = list[a];
                    list[a] = temp;
                    System.out.print("변경 발생");
                    change++;
                }
                System.out.println();
                a++;
                for (int i = 0; i < list_length; i++) {
                    System.out.print(list[i] + " ");
                }
                s++;
                count++;
                System.out.println();
                if (a + 1 >= f) {
                    a = 0;
                    break;
                }
            }
            n++;
        }
        System.out.println();
        System.out.println("<최종 결과>");
        for (int i = 0; i < list_length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("실행 횟수 : " + count);
        System.out.println("변경 횟수 : " + change);


    }
}