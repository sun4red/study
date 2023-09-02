package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Sort {
    // 삽입정렬
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

        int count = 0, change = 0;

        for (int ins = 1; ins < list_length; ins++) {
            int s = 1;
            for (int n = 0; n < ins; n++) {
                int temp = 0;
                System.out.print("[" + (ins) + "회전-" + s + "차]");
                if (list[ins] < list[n]) {
                    temp = list[ins];
                    for (int i = ins; n < i; i--) {
                        list[i] = list[i - 1];
                    }
                    list[n] = temp;
                    System.out.print("변경 발생");
                    change++;
                }
                System.out.println();
                for (int i = 0; i < list_length; i++) {
                    System.out.print(list[i] + " ");
                }
                System.out.println();
                s++;
                count++;
                if (temp != 0) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("<최종 결과>");
        for (int i = 0; i < list_length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("실행 횟수 : " + count);
        System.out.println("변경 횟수 : " + change);

        /* ========== 정렬 완료 ========== */

        Connection con = null;
        PreparedStatement pstmt = null;

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, "hong", "2143");

            String sql = "insert into sort_result(type, list_length, executions, changes, ex_date)" +
                    " values(?,?,?,?,sysdate)";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "insert");
            pstmt.setInt(2, list_length);
            pstmt.setInt(3, count);
            pstmt.setInt(4, change);

            int result = pstmt.executeUpdate();

            if (result == 1) {
                System.out.println("통계 DB 반영 성공");
            } else {
                System.out.println("통계 DB 반영 실패");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
            }
        }
    }
}

