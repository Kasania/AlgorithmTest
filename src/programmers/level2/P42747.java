/*
 * Author : 나상혁 : Kasania
 * Filename : P42747 : H-Index
 * Desc : 인용횟수를 정렬한 뒤, 남은 논문의 갯수가 현재 논문의 인용횟수보다 작거나 같아지는 시점의 남은 논문갯수를 H-Index로 지정해 리턴한다.
 */
package programmers.level2;

import java.util.Arrays;

public class P42747 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int HIndex = citations[0];
        for (int i = 0; i < citations.length; i++) {
            if(citations.length - i <= citations[i]){
                HIndex = citations.length - i;
                break;
            }
        }
        return HIndex == -1? citations.length : HIndex;
    }
}
