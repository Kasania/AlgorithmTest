/*
 * Author : 나상혁 : Kasania
 * Filename : P12910 : 나누어 떨어지는 숫자 배열
 * Desc : 나누어 떨어지는 숫자 배열을 리턴한다.
 */
package programmers.level1;

import java.util.Arrays;

public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(v -> v % divisor == 0).sorted().toArray();
        return answer.length >0? answer: new int[]{-1};
    }
}
