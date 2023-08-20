package acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class SelectDB_avg {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/acc";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "hong", "2143");
			sql = "select avg(amount) as \"평균\" from payment";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// ResultSet 결과값 조회 시 rs.nest()를 이용해 커서 이동..?
			/*
			평균 값을 가져오려면 ResultSet에서 가져온 데이터를 처리해야 하는데,
			현재 코드에서는 rs.getDouble("avg")를 사용하여 평균 값을 가져오려고 시도하고 있습니다.
			그러나 이 부분에서 발생하는 오류는 "Before start of result set"이며,
			ResultSet의 커서 위치를 조작하지 않았기 때문에 발생합니다.
			ResultSet을 다룰 때는 반드시 rs.next() 메서드를 호출하여 커서를 다음 행으로 이동시켜야 합니다.
			이렇게 해야만 현재 행에 있는 데이터에 접근할 수 있습니다. 아래 코드와 같이 수정해보세요:
				*/
			if (rs.next()) {
				double avg = rs.getDouble("평균");
				System.out.println("금액 평균");
				System.out.println(avg);
			}
// 조건문을 이용해 조회하는 절차가 필요한 것으로 보임.

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
