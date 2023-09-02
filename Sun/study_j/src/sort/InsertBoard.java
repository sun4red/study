package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			System.out.println("작성자명을 입력 하세요?");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력 하세요?");
			String passwd = br.readLine();
			System.out.println("제목을 입력 하세요?");
			String subject = br.readLine();
			System.out.println("내용을 입력 하세요?");
			String content = br.readLine();

			String sql = "insert into board ";
			sql += "values(?,?,?,?,sysdate)";

			pstmt = con.prepareStatement(sql);
			// sql문을 실행시켜주는 역할

			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);

			int result = pstmt.executeUpdate(); // insert SQL문 실행
			if (result == 1) {
				System.out.println("글작성 성공");
			} else {
				System.out.println("글작성 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
