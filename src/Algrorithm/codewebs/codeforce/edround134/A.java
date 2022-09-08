package Algrorithm.codewebs.codeforce.edround134;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char[][] x=new char[2][];
            x[0]=sc.next().toCharArray();
            x[1]=sc.next().toCharArray();
            Map<Character,Integer> map=new HashMap<>();
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if(!map.containsKey(x[j][k])){
                        map.put(x[j][k],1);
                    }
                }
            }
            if(map.size()==4){
                System.out.println(3);
            } else if (map.size()==3) {
                System.out.println(2);
            } else if (map.size()==2) {
                System.out.println(1);
            } else{
                System.out.println(0);
            }
        }
    }
}
