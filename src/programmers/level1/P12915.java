/*
 * Author : 나상혁 : Kasania
 * Filename : P12915 : 문자열 내 마음대로 정렬하기
 * Desc : 문자열을 사전순으로 1차 정렬 후, 인덱스별 문자를 기준으로 2차 정렬한다.
 */
package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class P12915 {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted().sorted(Comparator.comparingInt(o -> o.charAt(n))).toArray(String[]::new);
    }
}
