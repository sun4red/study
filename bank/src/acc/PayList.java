package acc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Payment> paylist = new ArrayList();
		Payment pay = new Payment();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int i = 0;
			while (true) {
				System.out.println("현재 입력된 정보 : " + i + "개");
				System.out.println("결제정보 입력 y/n");
				String yn = br.readLine();
				if (yn.equals("y")) {

					System.out.println("참가자 이름 입력하세요");
					pay.setMember(br.readLine());
					System.out.println("항목을 입력하세요");
					pay.setItem(br.readLine());
					System.out.println("금액을 입력하세요");
					pay.setAmount(Double.parseDouble(br.readLine()));

					paylist.add(i,pay);

					i++;
				} else if (yn.equals("n")) {
					System.out.println("입력 종료");
					break;
				} else {
					System.out.println("잘못된 입력");
					continue;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < paylist.size(); i++) {
			System.out.println("<" + (i + 1) + "번째 결제 건>");
			System.out.println("참여자 :\t" + paylist.get(i).getMember());
			System.out.println("항목 :\t" + paylist.get(i).getItem());
			System.out.println("금액 :\t" + paylist.get(i).getAmount());
			System.out.println();
		}

	}

}
