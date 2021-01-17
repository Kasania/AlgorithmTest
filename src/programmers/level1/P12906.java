/*
 * Author : 나상혁 : Kasania
 * Filename : P12906: 같은 숫자는 싫어
 * Desc : 직전값을 저장하고, 현재 값과 직전값을 비교하여 다른 경우만 모아 리턴합니다.
 *        Thread-safe 하지 않습니다.
 */
package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class P12906 {
    int pre;
    public int[] solution(int []arr) {
        pre = arr[0];
        return Stream.concat(
                Stream.of(arr[0]),
                Arrays.stream(arr)
                        .skip(1)
                        .filter(value -> pre != value && value == (pre = value))
                        .boxed())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
