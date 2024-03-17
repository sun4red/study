package practice.q159994;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

//        하나씩 써야함.
//        cards1.length + cards2.length = goal.length

        int cardcount1 = 0;
        int cardcount2 = 0;

        answer = "Yes";

        for (int i = 0; i < goal.length; i++) {
            if (cardcount1 < cards1.length) {
                if (goal[i].equals(cards1[cardcount1])) {
                    cardcount1++;
                    continue;
                }
            }
            if (cardcount2 < cards2.length) {
                if (goal[i].equals(cards2[cardcount2])) {
                    cardcount2++;
                    continue;
                }
            }
            answer = "No";
        }


        return answer;
    }
}