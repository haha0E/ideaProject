package Algrorithm.Vol.V_BackTrack;

public class n_queens {
    static int n;
    static int []x;
    static long sum;
    public static long Nqueens(int nn){
        n=nn;
        sum=0;
        x=new int[n+1];
        for (int i = 0; i <=n ; i++) {
            x[i]=0;
        }
        backtrack(1);
        return sum;
    }
    public static void backtrack(int i){
        if(i>n){
            sum++;
        }else{
            for (int j = 1; j <=n ; j++) {
                x[i]=j;
                if(judgeplace(i))backtrack(i+1);
            }
        }
    }
    public static boolean judgeplace(int k){
        for (int i = 1; i < k; i++) {
            if((Math.abs(k-i)==Math.abs(x[i]-x[k]))||(x[i]==x[k]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        n_queens N=new n_queens();
        N.Nqueens(6);
        System.out.println(sum);
    }
}
