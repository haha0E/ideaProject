package Algrorithm.codewebs.leetcode;

public class letterToRomaNumber {
    public String intToRoman(int num) {
        int temp=num;
        int cnt=0;
        String ans="";
        while(temp>0){
            temp/=10;
            cnt++;
        }
        int[] digit=new int[cnt];
        for(int i=0;i<cnt;i++){
            digit[i]=num%10;
            num/=10;
        }
        for(int i=0;i<cnt;i++){
            switch (i){
                case 0:
                    while(digit[i]>0){
                        ans+="I";
                        digit[i]--;
                    }
                    break;
                case 1:
                    while(digit[i]>0){
                        ans+="X";
                        digit[i]--;
                    }
                    break;
                case 2:
                    while(digit[i]>0){
                        ans+="C";
                        digit[i]--;
                    }
                    break;
                case 3:
                    while(digit[i]>0){
                        ans+="M";
                        digit[i]--;
                    }
                    break;
            }
        }
        ans.replaceFirst("IIIII","V");
        ans.replaceFirst("IIII","IV");
        ans.replaceFirst("VIV","IX");
        ans.replaceFirst("XXXXX","L");
        ans.replaceFirst("XXXX","XL");
        ans.replaceFirst("LXL","XC");
        ans.replaceFirst("CCCCC","D");
        ans.replaceFirst("CCCC","CD");
        ans.replaceFirst("DCD","DM");
        return ans;
    }

    public static void main(String[] args) {
        letterToRomaNumber letterToRomaNumber=new letterToRomaNumber();
        String s=letterToRomaNumber.intToRoman(1692);
        System.out.println(s);
    }
}
