package Interviewing.qunaer;

import java.util.HashMap;
import java.util.Map;

public class C {
    public static void main(String[] args){

    }
    public String showDown(String inHand){
        String[] numbers= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        String[] c=inHand.split(" ");
        boolean isStraights= true;//可能有顺子
        boolean contain2=false;//对子
        boolean ishomo_florist=false;//同花
        boolean contain3=false;
        boolean contain4=false;
        for(String i:c){
            String x=i.substring(0,1);
            String y=i.substring(1);
            if(map1.containsKey(x)){
                map1.put(x, map1.get(x)+1);
                contain2=true;
                if(map1.get(x)>2)
                    contain3=true;
                if(map1.get(x)>3)
                    contain4=true;
            }else{
                map1.put(x,1);
            }
            if(map2.containsKey(y)){
                map2.put(y, map2.get(y)+1);
                if(map2.get(y)>4)
                    ishomo_florist=true;
            }else{
                map2.put(y,1);
            }
        }
        return  "";
    }
}
