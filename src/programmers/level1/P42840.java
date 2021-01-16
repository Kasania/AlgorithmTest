/*
 * Author : 나상혁 : Kasania
 * Filename : P42840 : 모의고사
 * Desc : 단순히 맞춘 정답수를 센 뒤 최대값이 아닌것은 걸러내는 방식입니다.
 */
package programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P42840 {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == p1[i%p1.length]){
                count[0]+=1;
            }
            if(answers[i] == p2[i%p2.length]){
                count[1]+=1;
            }
            if(answers[i] == p3[i%p3.length]){
                count[2]+=1;
            }
        }

        int max = Arrays.stream(count).max().getAsInt();
        return IntStream.range(1, count.length+1).filter(i -> count[i-1] == max).toArray();
    }
}
