package Algrorithm.Vol.III_Dp;

public class MNS {
    public static void main(String[] args) {
        int[] c={0,6,8,12,2,1,4,5,3,11,7,10,9,13};
        int n=c.length;
        int[][] size=new int[n][n];
        MNS(c,size);
        System.out.println("该层的最大连线数是："+size[n-1][n-1]);
        System.out.print("连线分别为：");
        traceback(size,c);
    }

    /**
     * 动态规划方法求最大不相交子集
     * @param c
     * @param size
     */
    public static void MNS(int[] c,int[][] size){
        int n=c.length;
        //边界条件
        for(int i=c[1];i<n;i++){
            size[1][i]=1;
        }
        for(int i=1;i<c[1];i++){
            size[1][i]=0;
        }
        //根据递归结果计算
        for(int i=2;i<n;i++){
            for(int j=0;j<c[i];j++){
                size[i][j]=size[i-1][j];
            }
            for(int j=c[i];j<n;j++){
                size[i][j]=Math.max(size[i-1][j-1],size[i-1][c[i]-1]+1);
            }
        }
    }
    public static void traceback(int[][] size,int[] c){
        int n=size.length-1;
        int j=n;
        for(int i=n;i>=1;i--){
            if(size[i][j]==size[i-1][j]+1){
                System.out.print("("+i+","+c[i]+")"+" ");
                j=c[i]-1;
            }
        }
        System.out.println();
    }
}
