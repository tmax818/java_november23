import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4));

        ArrayList<Object> junk = new ArrayList<>();

        junk.add("A string");
        junk.add(42);
        junk.add(true);

        System.out.println(junk);

        System.out.println(nums);

        
    }
}