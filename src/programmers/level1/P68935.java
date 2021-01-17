/*
 * Author : 나상혁 : Kasania
 * Filename : P68935 : 3진법 뒤집기
 * Desc : 역순으로 3진법으로 변환한 값을 리턴한다.
 */
package programmers.level1;

public class P68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n /=3;
        }
        return Integer.parseInt(sb.toString(),3);
    }
}
