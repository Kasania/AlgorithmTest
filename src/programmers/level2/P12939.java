/*
 * Author : 나상혁 : Kasania
 * Filename : P12939 : 최댓값과 최솟값
 * Desc : 단순한 문자열 파싱문제이다.
 */
package programmers.level2;

public class P12939 {
    public String solution(String s) {
        String[] strs = s.split(" ");
        int max = Integer.parseInt(strs[0]);
        int min = Integer.parseInt(strs[0]);
        for (String str : strs) {
            int num = Integer.parseInt(str);
            if(num > max) max = num;
            if(min > num) min = num;
        }
        return min + " " + max;
    }
}
