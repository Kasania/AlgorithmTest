/*
 * Author : 나상혁 : Kasania
 * Filename : P42748 : K번째수
 * Desc : 각 배열마다 i~j까지의 배열요소를 복사한 뒤, 정렬후 k번째의 수를 찾아 리턴합니다.
 */
package programmers.level1;

import java.util.Arrays;

public class P42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            answer[i++] = Arrays.stream(Arrays.copyOfRange(array,command[0],command[1]+1)).sorted().toArray()[command[2]-1];
        }
        return answer;
    }
}
