package Algrorithm.codewebs.codeforce.global_round_23;



import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                sum+=a[j];
            }
            if(sum>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
