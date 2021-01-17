/*
 * Author : 나상혁 : Kasania
 * Filename : P12903: 가운데 글자 가져오기
 * Desc : 단순한 산술연산을 통해 문자열의 중앙 문자를 리턴합니다.
 */
package programmers.level1;

public class P12903 {
    public String solution(String s) {
        return s.substring((s.length()-1)/2, s.length()/2+1);
    }
}
