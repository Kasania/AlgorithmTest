/*
 * Author : 나상혁 : Kasania
 * Filename : P12901 : 2016년
 * Desc : Calender에 날짜를 입력한 뒤, 요일을 얻어 리턴합니다.
 */
package programmers.level1;

import java.util.Calendar;
import java.util.Locale;

public class P12901 {
    public String solution(int a, int b) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,a-1,b);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.SHORT, Locale.ENGLISH).toUpperCase();
    }
}
