import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Basic13 b13 = new Basic13();
        // b13.printNumsto100();
        // b13.printEvenNumsto100();
        int[] nums = {1,2, 78, 42, 99, 2};
        int largest = b13.findLargest(nums);
        System.out.println(largest);
        // System.out.println(b13.createOddArray());
        int[] odds = b13.createOddCArray();
        System.out.println(Arrays.toString(odds));
    }
    
}
