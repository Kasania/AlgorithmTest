/*
 * Author : 나상혁 : Kasania
 * Filename : P12917 : 문자열 내림차순으로 배치하기
 * Desc : String을 char스트림으로 변환후, 내림차순 정렬하여 리턴한다.
 */
package programmers.level1;

import java.util.Comparator;
import java.util.stream.Collectors;

public class P12917 {
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }
}
