/*
 * Author : 나상혁 : Kasania
 * Filename : P12913 : 땅따먹기
 * Desc : 현재 지나가려는 길과 겹치지 않는 지나온 경로중 최대값을 더해서,
 *        경로를 만들고, 완성된 경로중 최대값을 리턴한다.
 */
package programmers.level2;

import java.util.Arrays;

public class P12913 {
    int solution(int[][] land) {

        int[] pre = new int[4];

        for (int[] ints : land) {

            int[] curr = new int[4];
            System.arraycopy(ints,0,curr,0,4);

            curr[0] += max(pre[1], pre[2], pre[3]);
            curr[1] += max(pre[0], pre[2], pre[3]);
            curr[2] += max(pre[1], pre[0], pre[3]);
            curr[3] += max(pre[1], pre[2], pre[0]);
            System.arraycopy(curr,0,pre,0,4);
        }

        return Arrays.stream(pre).max().getAsInt();
    }

    int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
}
