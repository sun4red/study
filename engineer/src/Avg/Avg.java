package Avg;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Avg {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("숫자 입력 시 합계, 평균 값 출력");
		int sum = 0, i;
		double avg;

		i = 1;
		while (true) {
			try {
				System.out.println(i + "번째 숫자 입력");
				Integer num = new Integer(br.readLine());


				sum += num;
				avg = sum / i;
				System.out.println("현재 입력 숫자 " + i + "개");
				System.out.println("현재 합계 : " + sum);
				System.out.println("현재 평균 : " + avg);
				i++;

				FileWriter fw = new FileWriter("avg result.txt");
				fw.write("연산결과\n입력된 숫자 : "+i+"개\n합계 : "+sum+ "\n평균 : " + avg);
				fw.close();
				
			} catch (IOException e) {
				break;
			}
		
		}
	}

}
