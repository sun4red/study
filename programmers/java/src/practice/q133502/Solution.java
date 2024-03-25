package practice.q133502;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

//         순서대로 쌓고 재료 빠지면 나머지부터 다시 시작


//        재료 순서 : 1 - 2 - 3 - 1


//        재료가 빠지면 0으로 구현하자

        int a = 0, b = 0, c = 0, d = 0;
        int drop = 0;

        while (true) {

            if (a < 0) a = 0;
            if (a >= ingredient.length)
                break;
            while (a < ingredient.length && ingredient[a] == 0) a++;
            b = a + 1;
            if (b >= ingredient.length)
                break;
            while (b < ingredient.length && ingredient[b] == 0) b++;

//            1 다음에 3이 오면 해결이 불가하다.
            if(ingredient[a]==1&&ingredient[b]==3) {
                drop = b + 1;
                a=drop;
                continue;
            }


            c = b + 1;
            if (c >= ingredient.length)
                break;
            while (c < ingredient.length && ingredient[c] == 0) c++;
            d = c + 1;
            if (d >= ingredient.length)
                break;
            while (d < ingredient.length && ingredient[d] == 0) d++;


//            System.out.println(a + " " + b + " " + c + " " + d);


            if (ingredient[a] == 1 && ingredient[b] == 2 && ingredient[c] == 3 && ingredient[d] == 1) {
                ingredient[a] = 0;
                ingredient[b] = 0;
                ingredient[c] = 0;
                ingredient[d] = 0;


                answer++;

                a=drop;

            } else {
                a += 1;
            }


        }


        return answer;
    }
//
//    public static void main(String[] args) {
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
//        System.out.println(solution.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
//
//    }
}