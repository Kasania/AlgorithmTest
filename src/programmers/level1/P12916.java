/*
 * Author : 나상혁 : Kasania
 * Filename : P12916 : 문자열 내 p와 y의 개수
 * Desc : p와 개수와 y의 개수의 차를 리턴한다.
 */
package programmers.level1;

public class P12916 {
    int count = 0;
    boolean solution(String s) {
        s.chars().map(Character::toLowerCase).map(o -> o== 'p' ? ++count :o== 'y'? --count : o).toArray();
        return count==0;
    }

}
