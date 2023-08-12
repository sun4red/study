package acc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/acc";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "hong", "2143");

			String sql = "insert into payment(day, member, item, amount, reg_date)";
			sql += " values(sysdate(), ?,?,?,sysdate());";

			System.out.println("참여자를 입력하세요");
			String member = br.readLine();
			System.out.println("항목을 입력하세요");
			String item = br.readLine();
			System.out.println("금액을 입력하세요");
			double amount = Double.parseDouble(br.readLine());

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, member);
			pstmt.setString(2, item);
			pstmt.setDouble(3, amount);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("데이터 입력 완료");
			} else {
				System.out.println("데이터 입력 실패");
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("입력완료");
		}
	}
}
