package set_question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_Insert {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, "hong", "2143");


            String part = "DB";
            String term = "test";
            String def = "test";

            String sql = "insert into study_memorize (part, term, def) values(?,?,?)";

            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, part);
            pstmt.setString(2, term);
            pstmt.setString(3, def);

            int result = pstmt.executeUpdate();
            /*if (result == 1) {
                System.out.println("데이터 입력 완료");
            } else {
                System.out.println("데이터 입력 실패");
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("입력완료?");
        }
    }
}
