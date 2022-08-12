package Algrorithm.codewebs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
    List<int[]> calendar = new ArrayList<int[]>();

    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        if (calendar.isEmpty()) {
            calendar.add(new int[]{start, end});
            return true;
        }
        for (int i = 0; i < calendar.size(); i++) {
            int[] now = calendar.get(i);
            if ((now[1] > start && now[0] <= start) || (now[0] < end && now[1] >= end)||(now[0]>=start&&now[1]<=end)) {
                return false;
            }
        }
        calendar.add(new int[]{start, end});
        return true;


    }
}
