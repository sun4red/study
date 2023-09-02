package sort;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test {
    public static void main(String[] args) {

        int list_length=4,count=4,change=4;

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
            System.out.println("엑시큐트업데이트 실행안됨");

            System.out.println(result);

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
