import javax.sound.midi.Soundbank;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};



        int end = sequence.length-1;

        int r1 = 0;
        int r2 = 0;

        for(int b = 0; end - b >= 0; b++){
            int sum = 0;
            boolean tf = true;
            for(int m = 0; end - b - m >= 0 ; m++){
                sum += sequence[end-b-m];
                if(sum == k){
                    if(end - b - m - 1 >= 0 && sequence[end-b-m-1] == sequence[end-b]){
                        break;
                    }
                    r2 = end - b;
                    r1 = end - b - m;
                    tf = false;

                    System.out.println(r1 + " " + r2);

                    break;
                }
                if(sum > k){
                    break;
                }
                if(!tf) break;
            }

        }

        answer = new int[2];
        answer[0] = r1;
        answer[1] = r2;

        return answer;
    }



}
