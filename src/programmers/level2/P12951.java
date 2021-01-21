/*
 * Author : 나상혁 : Kasania
 * Filename : P12951 : JadenCase 문자열 만들기
 * Desc : 반복문을 사용하면 더 빠르지만, 스트림 연습겸 써보았다.
 */
package programmers.level2;

import java.util.stream.Collectors;

public class P12951 {
    boolean checked;
    public String solution(String s) {
        checked = true;
        return s.toLowerCase().chars().map(ch -> {
            if (ch == ' ') {
                checked = true;
                return ' ';
            }
            else{
                if(checked){
                    checked = false;
                    if(Character.isAlphabetic((char)ch)){
                        return Character.toUpperCase((char)ch);
                    }
                }
                return ch;
            }

        }).mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
    }
}
