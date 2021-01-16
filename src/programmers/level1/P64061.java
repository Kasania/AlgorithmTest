/*
 * Author : 나상혁 : Kasania
 * Filename : P64061 : 크레인 인형뽑기 게임
 * Desc : 2019 카카오 개발자 겨울 인턴십 코딩 테스트에 출제된 문제입니다.
 */
package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class P64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> pops = new ArrayList<>();
        for (int move : moves) {
            for(int j = 0; j < board.length; ++j){
                if(board[j][move-1] != 0){
                    pops.add(board[j][move-1]);
                    board[j][move-1] = 0;
                    break;
                }
            }
            if(pops.size()>=2){
                if(pops.get(pops.size() - 1).equals(pops.get(pops.size() - 2))){
                    pops.remove(pops.size()-1);
                    pops.remove(pops.size()-1);
                    answer+=2;
                }
            }
        }
        return answer;
    }
}
