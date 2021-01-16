/*
 * Author : 나상혁 : Kasania
 * Filename : P42576 : 완주하지 못한 선수
 * Desc : 해시맵을 사용한 단순한 풀이입니다.
 */
package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        for (String s : participant) {
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else{
                map.put(s,1);
            }
        }

        for (String s : completion) {
            int count = map.get(s);
            if(count > 1){
                map.put(s,count-1);
            }
            else{
                map.remove(s);
            }
        }
        return new ArrayList<>(map.keySet()).get(0);
    }
}
