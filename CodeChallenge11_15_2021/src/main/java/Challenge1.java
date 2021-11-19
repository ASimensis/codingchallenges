import java.util.Arrays;

public class Challenge1 {
    public static void main(String args[]) {
        Challenge1 challenge1 = new Challenge1();

        boolean result1 = challenge1.ascending("12131415");
        System.out.println(result1);

        boolean result2 = challenge1.ascending("0102030405");
        System.out.println(result2);
    }

    public boolean ascending(String nums){
        System.out.println(nums);
        int firstNum;

        for(int i=0; i<nums.length()/2; i++) {
            String subStr = nums.substring(0, i+1);
            int newFirst = Integer.parseInt(subStr);
            firstNum = newFirst;

            while(subStr.length()<nums.length()) {
                newFirst++;
                //System.out.println(subStr);
                subStr += String.valueOf(newFirst);
                //System.out.println(subStr);
            }
            if(subStr.equals(nums)) {
                return true;
            }
        }
        return false;
    }
}
