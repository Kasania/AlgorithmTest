/*
 * Author : 나상혁 : Kasania
 * Filename : P12918 : 문자열 다루기 기본
 * Desc : 원본 문자열의 길이와, 문자열에 포함된 숫자의 갯수가 같은지 비교한 후, 그 길이가 4 또는 6인지 확인한 결과를 리턴한다.
 */
package programmers.level1;

public class P12918 {
    public boolean solution(String s) {
        return s.length() == s.chars().filter(Character::isDigit).count() && (s.length() == 4 ||s.length() == 6);
    }
}
