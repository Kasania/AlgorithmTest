/*
 * Author : 나상혁 : Kasania
 * Filename : P12909 : 올바른 괄호
 * Desc : 괄호의 개수를 세는 문제이다.
 */
package programmers.level2;

public class P12909 {

    boolean solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                count +=1;
            }
            else{
                count -=1;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
    }

}
