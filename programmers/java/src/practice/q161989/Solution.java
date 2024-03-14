package practice.q161989;

/*
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;


        int left = 0;
        int right = 0;
        int last = section.length - 1;
        int count = 0;

        int i = 0;
        while (right < n) {

            left = section[i];
            right = left + m - 1;
            for (int a = 1; i + a < last; a++) {
                if (section[i + a] <= right) {

                    if (section[i + a] >= n) {
                        right = n;
                        break;
                    }
                    i++;
                }

                i++;
                count++;
            }
        }
        answer = count;
        return answer;


    }
}
*/

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        for (int item : section) {
            if (start + m > item) {
                continue;
            }
            start = item;
            answer++;
        }
        return answer;
    }
}
//그리디 알고리즘 사용했다고 함
//출처: https://tang25.tistory.com/entry/프로그래머스-덧칠하기-Lv1-JAVA-그리디엄탱 [엄탱 개발 블로그:티스토리]