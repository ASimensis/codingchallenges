import java.util.Arrays;


public class Challenge2 {
    public static void main(String args[]) {
        Challenge2 challenge2 = new Challenge2();
        challenge2.squarePatch(3);
    }

    public void squarePatch(int num) {
        //add control flow
        if(num <= 0) {
            System.out.println("[]");
            return;
        }

        int sample[][] = new int[num][num];
        int i,k;

        for(i=0;i<num;i++){
            for(k=0;k<num;k++){
                sample[i][k] = num;
            }
            System.out.println(Arrays.toString(sample[i]));
        }
        return;
    }
}
