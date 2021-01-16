/*
 * Author : 나상혁 : Kasania
 * Filename : P68644 : 두 개 뽑아서 더하기
 * Desc : 서로 다른 인덱스의 두 수를 뽑아서 더하는 문제입니다.
 *        단순히 서로 다른 인덱스의 두 수를 뽑아서 더하고, Stream을 사용해 중복 제거 및 정렬을 진행하였습니다.
 */
package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class P68644 {
    public int[] solution(int[] numbers) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = i+1; i1 < numbers.length; i1++) {
                ans.add(numbers[i] + numbers[i1]);
            }
        }

        return ans.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}
