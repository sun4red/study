package acc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.SimpleDateFormat;

public class SelectDB {
    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/acc";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;

        try {

            Class.forName(driver);

            con = DriverManager.getConnection(url, "hong", "2143");

            sql = "select * from payment where member = '선홍'";

            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            int no;
            Timestamp day;
            String member;
            String item;
            double amount;
            Timestamp reg_date;
            SimpleDateFormat sd = new SimpleDateFormat("yy-MM-dd");

            System.out.println("번호\t결제일\t\t결제인\t품목\t금액\t\t입력일");

            while (rs.next()) {
                no = rs.getInt("no");
                day = rs.getTimestamp("day");
                member = rs.getString("member");
                item = rs.getString("item");
                amount = rs.getDouble("amount");
                reg_date = rs.getTimestamp("reg_date");
                System.out.printf("%d\t%s\t%s\t%s\t%.2f\t%s\n", no, sd.format(day), member, item, amount,
                        sd.format(reg_date));
            }

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
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
