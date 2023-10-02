package acc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// 의문점 : DB를 자바의 자료구조에 불러온 뒤 연산(평균값 내기)하는 방법과 sql문으로 select구문에 연산결과를 가져오는 방법의 차이

public class DBtoList {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/acc";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;

        List<Payment> paylist = new ArrayList();

        try {

            Class.forName(driver);

            con = DriverManager.getConnection(url, "hong", "2143");

            sql = "select * from payment";

            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Payment pm = new Payment();
                pm.setMember(rs.getString("member"));
                pm.setItem(rs.getString("item"));
                pm.setAmount(rs.getDouble("amount"));
                paylist.add(pm);

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
        } // try - finally end

        double sum = 0;

        for (int i = 0; i < paylist.size(); i++) {
            System.out.println("<" + (i + 1) + "번째 결제 건>");
            System.out.println("참여자 \t:" + paylist.get(i).getMember());
            System.out.println("항목 \t:" + paylist.get(i).getItem());
            System.out.println("금액 \t:" + paylist.get(i).getAmount());
            System.out.println();
            sum += paylist.get(i).getAmount();
        }
        double avg = sum / paylist.size();

        System.out.println("<결산>");
        System.out.println("총 금액 \t :" + sum);
        System.out.println("1건당 평균 금액 \t :" + avg);

    }

}
