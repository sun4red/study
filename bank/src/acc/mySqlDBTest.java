package acc;

import java.sql.Connection;
import java.sql.DriverManager;

class mySqlDBTest {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/acc";

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hong", "2143");
			System.out.println("연결테스트 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결테스트 실패");
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println("연결오류");
			}
		}

	}
}
