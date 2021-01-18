/*
 * Author : 나상혁 : Kasania
 * Filename : P12941 : 최솟값 만들기
 * Desc : 배열들을 정렬한 뒤, 하나는 정방향 하나는 역방향으로 순회하면서 곱하고, 합계를 구하면 된다.
 */
package programmers.level2;

import java.util.Arrays;

public class P12941 {

    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[A.length-i-1];
        }
        return sum;
    }
}
