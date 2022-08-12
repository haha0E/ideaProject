package Algrorithm.codewebs.leetcode.yanghui_Triangle;
import java.util.LinkedList;
import java.util.List;
public class solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> x=new LinkedList<List<Integer>>();
        List<Integer> head=new LinkedList<Integer>();
        head.add(1);
        x.add(head);
        int first=head.get(0);
        int last=head.get(head.size()-1);
        for (int i = 2; i < numRows+1; i++) {
            List<Integer> before=x.get(x.size()-1);
            List<Integer> now =new LinkedList<Integer>();
            now.add(1);
            for (int j = 1; j < i-1; j++) {
                now.add(before.get(j)+before.get(j-1));
            }
            now.add(1);
            x.add(now);
        }
        return x;
    }

}
