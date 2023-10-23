import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> users = new HashMap<>();
        users.put("Nyasha", 24);
        users.put("Tyler", 39);

        int age = users.get("Tyler");

        System.out.println(users);
        System.out.println(age);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,4));
    }
}