package Algrorithm.codewebs.leetcode;

public class targetletter {
    public static char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int n = letters.length;
        for (int i = 1; i < n; i++) {
            int temp = letters[i] - ans;
            int temp1 = letters[i] - target;
            if (temp1 > 0) {
                if(ans-target>0){
                    if(ans-letters[i]>0){
                        ans=letters[i];
                    }
                }else {
                    ans=letters[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }
}
