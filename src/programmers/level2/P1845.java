/*
 * Author : 나상혁 : Kasania
 * Filename : P1845 : 폰켓몬
 * Desc : 배열을 Set에 집어넣고 Set의 크기와 배열/2의 크기 중 작은 것을  리턴하면 된다.
 */
package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class P1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(nums.length / 2, set.size());
    }
}
