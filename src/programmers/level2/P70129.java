/*
 * Author : 나상혁 : Kasania
 * Filename : P70129 : 이진 변환 반복하기
 * Desc : s에서 0의 개수를 세고, 전체 길이에서 이를 뺀 수를 다시 이진 문자열로 만든다.
 *        이를 반복하면서 0의 개수와 반복 횟수를 세면 된다.
 */
package programmers.level2;

public class P70129 {
    public int[] solution(String s) {
        String target = s;
        int zeroCount = 0;
        int repeatCount = 0;
        while(true){
            char[] t = target.toCharArray();
            if(t.length == 1) break;
            int innerCount = 0;
            for (char c : t) {
                if (c == '0') {
                    innerCount += 1;
                }
            }
            zeroCount += innerCount;
            repeatCount +=1;
            target = Integer.toBinaryString(t.length - innerCount);
        }
        return new int[]{repeatCount, zeroCount};
    }
}
