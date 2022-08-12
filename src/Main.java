import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> x=new ArrayList<>();
        x.add(t);
        boolean f=true;
        while(t!=1){
            int temp=0;
            while(t>0){
                temp+=(t%10)*(t%10);
                t=t/10;
            }
            t=temp;
            if(x.indexOf(t)!=-1){
                f=false;
                break;
            }
            x.add(t);
        }
        System.out.println(f);
    }

}
