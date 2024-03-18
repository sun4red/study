package practice.q135808;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
//        최고점 k, 한 상자에 m개
//        그런데 가격 결정요소는 상자 내 최저점 min
//        따라서 판매가격은 (min * m) 1번, 2번...


        Map<Integer, Integer> fLank = new HashMap<Integer, Integer>();

//        등수 map 최초 설정<점수,개수>
        for (int i = k; i >= 1; i--) {
            fLank.put(i, 0);
        }

//        점수별 계수
        for (int i = 0; i < score.length; i++) {
            fLank.put(score[i], fLank.get(score[i]) + 1);
        }


        int boxcount = score.length / m;
        int count = 0;
        int lank = k+1;
        while (boxcount > 0) {
            if (count < m) {
                lank--;
                count += fLank.get(lank);
                continue;
            }
            answer += lank * m;
            count -= m ;
            boxcount--;
        }



/* 시간초과
        int boxcount = (int) score.length / m;
        int[] boxscore = new int[boxcount];

        for (int a = 0; a < score.length - 1; a++) {
            for (int b = a + 1; b < score.length; b++) {
                if (score[a] < score[b]) {
                    int temp = score[b];
                    score[b] = score[a];
                    score[a] = temp;
                }
            }
        }
        int count = m-1;
        for (int i = 0; i < boxscore.length; i++) {
            boxscore[i] = score[count];
            count += m;
        }

        for (int i = 0; i < boxcount; i++) {
            answer += boxscore[i] * m;
        }
*/


        return answer;
    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int result = solution.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
//
//        System.out.println(result);
//    }
}