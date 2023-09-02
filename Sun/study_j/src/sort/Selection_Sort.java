package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.reflect.Array.getLength;

public class Selection_Sort {
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

        int p, n, s, count = 0;

        for (p = 0; p < list_length; p++) {
            s = 1;
            for (n = p+1; n < list_length; n++) {
                System.out.print("[" + (p + 1) + "회전-" + s + "차]");
                if (list[n] < list[p]) {
                    int temp = list[p];
                    list[p] = list[n];
                    list[n] = temp;
                    System.out.print("변경 발생");
                }
                System.out.println();
                count++;
                for (int i = 0; i < list_length; i++) {
                    System.out.print(list[i] + " ");
                }
                s++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("<최종 결과>");
        for (int i = 0; i < list_length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("실행 횟수 : " + count);
    }
}
