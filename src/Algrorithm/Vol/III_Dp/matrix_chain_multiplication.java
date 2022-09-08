package Algrorithm.Vol.III_Dp;


public class matrix_chain_multiplication {
    public static void main(String[] args) {
        int[] x={5,200,2,100,30,200};
        int n=x.length;
        int[][] m=new int[n][n];
        int[][] s=new int[n][n];
        matrix_chain(x,m,s);
        System.out.println("最少计算次数为："+m[1][n-1]);
        System.out.println("最优计算次序如下");
        traceback(s,1,n-1);
        System.out.println("数学表示如下");
        traceback2(s,1,n-1);
    }
    public static void matrix_chain(int[] p ,int[][] m,int[][] s){
        int n=p.length;
        for(int i=1;i<n;i++)
            m[i][i]=0;//边界条件
        for(int r=2;r<n;r++)//连乘长度（r个矩阵在一个运算优先级上）
            for(int i=1;i<n-r+1;i++){
                int j=i+r-1;
                //先假设一个断点 i
                m[i][j]=m[i+1][j]+p[i-1]*p[i]*p[j];
                s[i][j]=i;
                //再从 i 后面找更加好的断点
                for(int k=i+1;k<j;k++){
                    int t=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];//状态转移
                    if(t<m[i][j]) {//更换断点和计算次数
                        s[i][j]=k;
                        m[i][j]=t;
                    }
                }
            }
    }
    public static void traceback2(int[][] s,int i,int j){
        if(i==j) {
            System.out.print("Solution" + i);
            return ;
        }
        else {
            //断点为s[i][j]
            System.out.print("(");
            traceback2(s,i,s[i][j]);//断点之前
            traceback2(s,s[i][j]+1,j);//断点之后
            System.out.print(")");
        }
    }
    public static void traceback(int[][] s,int i,int j){
        if(i==j) return ;
        //断点为s[i][j]
        traceback(s,i,s[i][j]);//断点之前
        traceback(s,s[i][j]+1,j);//断点之后的部分
        System.out.println("Multiply Solution"+i+","+s[i][j]+"and Solution"+(s[i][j]+1)+","+j);
    }
}