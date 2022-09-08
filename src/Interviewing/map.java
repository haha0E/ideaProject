package Interviewing;

import java.util.ArrayList;
import java.util.List;

public class map {
    public static void main(String[] args) {
        map m=new map();
        System.out.println(m.findWhetherExistPath(3,new int[][]{{0,1},{0,2},{1,2},{1,2}},0,2));
    }
    public boolean findWhetherExistPath(int n, int[][] graph,int start,int end){
        int l=graph.length;
        List<Integer> acess=new ArrayList<>();
        boolean[] b=new boolean[l];
        acess.add(start);
        while(!acess.isEmpty()){
            int t=acess.remove(0);
            if(t==end){
                return true;
            }
            for(int i=0;i<l;i++){
                if(!b[i]&&graph[i][0]==t){
                    if(acess.indexOf(graph[i][1])==-1) {
                        acess.add(graph[i][1]);
                    }
                    b[i]=true;
                }
            }
        }
        return false;
    }
}
