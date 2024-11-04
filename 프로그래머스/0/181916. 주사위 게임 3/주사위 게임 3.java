import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d };
        Arrays.sort(dice); // 주사위 값을 오름차순으로 정렬하여 쉽게 비교 가능하게 함

        int ans = 0;

        // 1. 네 주사위 숫자가 모두 같을 경우
        if (dice[0] == dice[3]) {
            ans = 1111 * dice[0];
        }
        // 2. 세 개의 주사위 숫자가 같고 나머지 하나가 다른 경우
        else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            int p = dice[1]; // 세 개의 주사위 숫자
            int q = (dice[0] == dice[2]) ? dice[3] : dice[0]; // 나머지 다른 주사위 숫자
            ans = (int) Math.pow(10 * p + q, 2);
        }
        // 3. 두 쌍의 주사위가 각각 같은 경우
        else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0]; // 첫 쌍의 숫자
            int q = dice[2]; // 두 번째 쌍의 숫자
            ans = (p + q) * Math.abs(p - q);
        }
        // 4. 두 개의 주사위가 같은 숫자고, 나머지 두 개의 주사위가 각각 다른 경우
        else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        }
        // 5. 모든 주사위가 다른 경우
        else {
            ans = dice[0];
        }

        return ans;
    }
}
