package set_question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class oracle_test {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, "hong", "2143");
            System.out.println("DB연결 확인");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(con != null) {
                    con.close();
                }
                }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
