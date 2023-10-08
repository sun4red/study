package set_question;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class set {
    public static void main(String[] args) {

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        ResultSet rs = null;

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, "hong", "2143");

            String sql = "select count(*) as ea from study_memorize";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            int ea = 0;
            int num_ex = 100;
            int[] ex_num = new int[num_ex];

            while (rs.next()) {
                ea = rs.getInt("ea");
            }

            for (int op1 = 0; op1 < num_ex; op1++) {
                ex_num[op1] = (int) (Math.random() * ea + 1);
                for (int op2 = 0; op2 < op1; op2++) {
                    if (op1 > 0 && ex_num[op1] == ex_num[op2]) {
                        op1--;
                    }
                }
            }

            String problem = "";
            String answer = "";

            for (int op1 = 0; op1 < num_ex; op1++) {

                sql = "select part, term, def from (select rownum num, part, term, def from study_memorize) where num = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, ex_num[op1]);
                rs = pstmt.executeQuery();

                while (rs.next()) {
                    String part = rs.getString("part");
                    String term = rs.getString("term");
                    String def = rs.getString("def");

                    problem += "[" + (op1 + 1) + "번 문제] <" + part + ">\n\n";
                    answer += "[" + (op1 + 1) + "번 문제] <" + part + ">\n\n";
                    int ran = (int) (Math.random() * 2);
                    if (ran == 0) {
                        problem += "문제 : " + term + "\n\n\n\n";
                        answer += "문제 : " + term + "\n답 : " + def + "\n\n\n";
                    } else {
                        problem += "문제 : " + def + "\n\n\n\n";
                        answer += "문제 : " + def + "\n답 : " + term + "\n\n\n";
                    }

                }

            }
            try {
                FileWriter fw_p = new FileWriter("D:\\dev\\idea\\bank\\src\\set_question\\problem.txt");
                FileWriter fw_a = new FileWriter("D:\\dev\\idea\\bank\\src\\set_question\\answer.txt");

                fw_p.write(problem);
                fw_a.write(answer);

                fw_p.close();
                fw_a.close();

                System.out.println(problem);

            } catch (Exception e) {
                e.printStackTrace();
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
