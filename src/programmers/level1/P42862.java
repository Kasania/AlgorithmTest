/*
 * Author : 나상혁 : Kasania
 * Filename : P42862 : 체육복
 * Desc : Map과 Stream을 사용하여 작성한 풀이입니다.
 *        여벌 리스트와 도난 리스트에 동시에 존재하는 경우를 제외한
 *        남은 도난 리스트와 여벌리스트를 비교하여 앞번호, 뒷번호 순으로 체육복을 빌린 뒤,
 *        빌리지 못한 사람의 수를 세어 전체 수에서 뺀 값을 리턴합니다.
 */
package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Boolean> reserves = new HashMap<>();
        for (int i : reserve) {
            reserves.put(i,true);
        }

        return (int) (n- Arrays.stream(Arrays.stream(lost).filter(s -> {
            if (reserves.containsKey(s)) {
                reserves.replace(s, false);
                return false;
            }
            return true;
        }).toArray()).filter(s -> {
            if(reserves.containsKey((s-1)) && reserves.get((s-1))){
                reserves.replace(s-1,false);
                return false;
            }else if(reserves.containsKey((s+1)) && reserves.get((s+1))){
                reserves.replace(s+1,false);
                return false;
            }
            return true;
        }).count());
    }
}
