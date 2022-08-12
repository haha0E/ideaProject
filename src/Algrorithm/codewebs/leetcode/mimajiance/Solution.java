package Algrorithm.codewebs.leetcode.mimajiance;

public class Solution {
    public int strongPasswordChecker(String password) {
        int ans = 0;
        char t=password.charAt(0);
        int cnt = 0;//相同字符计数器
        int n = password.length();
        boolean flagDigit=false;
        boolean flagupper=false;
        boolean flaglower=false;
        int length=0;
        int format=0;
        int same=0;
        if(n<6){
            length=n-6;
        }else if(n>20){
            length=n-20;
        }
        for (int i = 0; i < n; i++) {
            char temp=password.charAt(i);
            if(Character.isDigit(temp)){
                flagDigit=true;
            }else if(Character.isUpperCase(temp)){
                flagupper=true;
            }else if(Character.isLowerCase(temp)){
                flaglower=true;
            }
            if(t==temp){
                cnt++;
            }else{
                t=temp;
                cnt=1;
            }
            if(cnt>=3){
                same+=cnt-2;
            }
        }
        format=(flaglower?0:1)+(flagupper?0:1)+(flagDigit?0:1);
        if(length>0){
            ans=Math.max(length+same,format);
        }else if(length<0){//加或者改
            ans=Math.max(Math.abs(length)+format,same);
        }else{
            ans=Math.max(same,format);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int x=solution.strongPasswordChecker("aaaB1");
        System.out.println(x);
    }
}
