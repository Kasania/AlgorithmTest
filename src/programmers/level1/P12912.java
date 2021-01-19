/*
 * Author : 나상혁 : Kasania
 * Filename : P12912 : 두 정수 사이의 합
 * Desc : 등차수열의 합 공식을 사용한 풀이이다.
 */
package programmers.level1;

public class P12912 {
    public long solution(int a, int b) {
        return (long) (Math.abs(a - b) + 1) * (a + b) / 2;
    }
}
