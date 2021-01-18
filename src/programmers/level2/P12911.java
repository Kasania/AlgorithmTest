/*
 * Author : 나상혁 : Kasania
 * Filename : P12911 : 다음 큰 숫자
 * Desc : n에서 1씩 더해가며 2진수에서 1의 갯수가 같은 첫번째 숫자를 찾아 리턴한다.
 */
package programmers.level2;

public class P12911 {

    public int solution(int n) {
        String bin = Integer.toBinaryString(n);
        int count = 0;
        for (char c : bin.toCharArray()) {
            if(c == '1') count +=1;
        }
        int num = n;
        while(true){
            num +=1;
            String bin2 = Integer.toBinaryString(num);
            int count2 = 0;
            for (char c : bin2.toCharArray()) {
                if(c == '1') count2 +=1;
            }
            if(count == count2) break;
        }
        return num;
    }

}
