package Algrorithm.Vol.III_Dp;

public class longest_common_subsequence {
    public static void main(String[] args) {
        char[] A={'A','C','T','C','C','T','A','G'};
        char[] B={'C','A','T','T','C','A','G','C'};
        int[][] c=new int[A.length+1][B.length+1];
        System.out.println("公共子序列的最长长度为："+lcslength(A,B,c));
        System.out.println("最长公共子序列为：");
        traceback(A,c,B.length, A.length);
    }
    public static int lcslength(char[] a,char[] b,int[][] c){
        int m=a.length;
        int n=b.length;
        int [][] l=new int[m+1][n+1];
        /**
         * 边界条件
         */
        for(int i=0;i<m;i++)
            l[i][0]=0;
        for(int i=0;i<n;i++)
            l[0][i]=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                /**
                 * 状态转移方程
                 */
                //如果仅求长度不需要回溯可以使用被注释的else部分，并且不需要数组c来记录
//                else{
//                    l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
//                }
                //两个else if 分情况记录子问题来源和赋值
                if(a[i]==b[j]){
                    l[i+1][j+1]=l[i][j]+1;
                    c[i+1][j+1]=1;
                }
                else if(l[i][j+1]>=l[i+1][j]){
                    l[i+1][j+1]=l[i][j+1];
                    c[i+1][j+1]=2;
                }
                else if(l[i][j+1]<=l[i+1][j]){
                    l[i+1][j+1]=l[i+1][j];
                    c[i+1][j+1]=3;
                }
            }
        }
        return l[m][n];
    }
    //寻找最长公共序列
    public static void traceback(char[] a,int[][] c,int i,int j){
        if(i==0||j==0)return;
        if(c[i][j]==1){
            traceback(a,c,i-1,j-1);
            System.out.print(a[i-1]);
        }
        else if(c[i][j]==2){
            traceback(a,c,i-1,j);
        }
        else if(c[i][j]==3){
            traceback(a,c,i,j-1);
        }
    }
}
