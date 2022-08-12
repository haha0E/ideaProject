package Algrorithm;

import java.util.ArrayList;
import java.util.List;

public class sub {
    public static List<List<Integer>> subSet(ArrayList<Integer> arr, int index) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (index>=arr.size()) {
            ans.add(new ArrayList<Integer>());
        } else {
            ans = subSet(arr, index + 1);
            int item = arr.get(index);
            List<List<Integer>> subset = new ArrayList<List<Integer>>();
            for (List<Integer> s : ans) {
                List<Integer> temp= new ArrayList<Integer>();
                temp.addAll(s);
                temp.add(item);
                subset.add(temp);
            }
            ans.addAll(subset);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
        System.out.println(subSet(arrayList,0));

    }

}



