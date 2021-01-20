/*
 * Author : 나상혁 : Kasania
 * Filename : P12919 : 서울에서 김서방 찾기
 * Desc : 배열을 순회하며 "Kim"을 만나기 전까지의 요소의 개수를 세어 위치를 찾는다.
 */
package programmers.level1;

import java.util.Arrays;

public class P12919 {
    public String solution(String[] seoul) {
        return "김서방은 "+ Arrays.stream(seoul).takeWhile(name -> !name.equals("Kim")).count()+"에 있다";
    }
}
