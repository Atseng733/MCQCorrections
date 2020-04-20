package Unit6;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for(int x=1; x < arr.length-1; x++) {
            arr[x+1] = arr[x] + arr[x+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*My answer: {10, 30, 60, 100, 50}
  Correct answer: [10, 20, 50, 90, 140]
  What I did incorrectly here was I was using the wrong index while working it 
  out in my head*/