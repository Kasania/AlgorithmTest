/*
 * Author : 나상혁 : Kasania
 * Filename : P12945 : 피보나치 수
 * Desc : 피보나치 변환 행렬을 사용한 풀이이다.
 *        값이 크므로 BigInteger를 사용했다.
 */
package programmers.level2;

import java.math.BigInteger;

public class P12945 {
    public int solution(int n) {
        return power(new BigInteger[]{BigInteger.valueOf(1), BigInteger.valueOf(1),
                BigInteger.valueOf(1), BigInteger.valueOf(0)},n)[3]
                .mod(BigInteger.valueOf(1234567)).intValue();
    }

    BigInteger[] power(BigInteger[] x, int n){
        BigInteger[] s = new BigInteger[4];
        System.arraycopy(x,0,s,0,4);

        for(int i = 0; i<n; ++i){
            s = new BigInteger[]{s[0].multiply(x[0]).add(s[1].multiply(x[2])), s[0].multiply(x[1]).add(s[1].multiply(x[3])),
                    s[2].multiply(x[0]).add(s[3].multiply(x[2])), s[2].multiply(x[1]).add(s[3].multiply(x[3]))};
        }
        return s;
    }

}
