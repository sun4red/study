package practice.q136798;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

//      기사단 넘버링 number
//      number의 약수 개수에 해당하는 공격력을 가진 무기 구매
//      공격력 > limit, power로 구매
//      공1당 철1

//        기사단이 오는 것

//      약수의 개수 구하기


//      소인수 분해와 몫으로 접근
//        시도 2 미해결

        int man = 0;
        for (man = 1; man <= number; man++) {
            int insuIndex = -1;
            List insu = new ArrayList();
            int div = 2;
            int beforeDiv = 1;
            int count = 0;
            int mok = man;

            while (mok > 1) {
                if (mok % div == 0) {
                    mok = mok / div;
                    if (div == beforeDiv) {
                        count++;
                        insu.add(insuIndex, count);
                    } else {
                        insuIndex++;
                        count = 1;
                        insu.add(insuIndex, count);
                        beforeDiv = div;
                    }

                } else {
                    div++;
                }
            }


            int cal = 1;
            for (int i = 0; i < insu.size(); i++) {
                cal *= (((int) insu.get(i)) + 1);
            }
            if (cal > limit) {
                cal = power;
            }
            answer += cal;
        }

        /* 풀이시도 1 시간초과
        int man;
        for(man = 1; man <= number; man++) {


            List divs = new ArrayList<>();
            int div = 1;
            while (div <= man) {
                if (man % div == 0) {
                    divs.add(div);
                }
                div++;
            }
            int ap = divs.size();

            if (ap > limit) {
                ap = power;
            }

            answer += ap;
        }



         */


        return answer;
    }
}