package Algrorithm.codewebs.codeforce.round819;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s=sc.next();
            List<List<Integer>> map=new ArrayList<>();
            for (int j = 0; j <=n; j++) {
                for (int k = j+1; k <=n; k++) {
                    if(isbalance(s.substring(j,k))){
                        if(map.isEmpty()){
                            List<Integer> com=new ArrayList<>();
                            com.add(j);
                            com.add(k);
                            map.add(com);
                        }else {
                            boolean f=false;
                            for (int l = 0; l < map.size(); l++) {
                                if(map.get(l).indexOf(j)!=-1){
                                    f=true;
                                    map.get(l).add(k);
                                }else if(map.get(l).indexOf(j)!=-1){
                                    map.get(l).add(j);
                                    f=true;
                                }
                            }
                            if(!f){
                                List<Integer> com=new ArrayList<>();
                                com.add(j);
                                com.add(k);
                                map.add(com);
                            }
                        }
                    }
                }
            }
            System.out.println(map.size());
        }
    }
    public static boolean isbalance(String s){
        while(s.length()!=0){
            String news=s.replaceAll("()","");
            if(news.length()==s.length()){
                return false;
            }
            s=news;
        }
        return true;

    }
}
