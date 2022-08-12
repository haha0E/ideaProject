package Algrorithm.codewebs.leetcode.canReorderDoubled;

class Solution {
    public boolean canReorderDoubled(int[] arr) {
        int n=arr.length;
        boolean[] flag=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!flag[i]){
                flag[i]=true;
                for(int j=i+1;j<n;j++){
                    if(!flag[j]){

                        if(arr[i]*2==arr[j]||arr[j]*2==arr[i]){
                            cnt++;
                            flag[j]=true;
                            break;
                        }

                    }
                }

            }
        }
        return cnt==n/2;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        boolean ans=solution.canReorderDoubled(new int[]{2,4,0,0,8,1});
        System.out.println(ans);
    }
}