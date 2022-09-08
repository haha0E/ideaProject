package Interviewing.qunaer;

public class A {

    public static void main(String[] args){
        A a=new A();
        int result=a.maxScore(
                10,new int[][]{{1,1},{2,3},{3,5},{5,10},{7,9},{8,10}}
        );
        System.out.println(result);
    }
    int ans=0;
    int res=0;
    int[] make;
    int n;
    public  int  maxScore(int energy,int [][] actions){
        res=energy;
        n=actions.length;
        make=new int[n];
        dfs(0,actions);
        return ans;
    }
    public void dfs(int points,int[][] actions){
        if(res>0){
            for(int i=0;i<n;i++){
                if(make[i]==0&& res-actions[i][0]>=0) {
                    make[i] = 1;
                    res-=actions[i][0];
                    dfs(points+actions[i][1],actions);
                    res+=actions[i][0];
                    make[i] = 0;
                }
            }
        }else if(points>ans){
            ans=points;
        }
    }
}
