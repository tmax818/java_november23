import java.util.ArrayList;
import java.util.Arrays;

public class Lists {

    public static void main(String[] args) {
        
        String[] groceryList = {"apples", "milk", "eggs"};
        groceryList[0] = "cheese";

        ArrayList<String> fancyList = new ArrayList<>();
        fancyList.add("milk");
        fancyList.add("eggs");

        ArrayList<Integer> numbers = new ArrayList<>();

        int favNumber = 42;
        numbers.add(43);
        numbers.add(favNumber);

        System.out.println(numbers);

        
        System.out.println(Arrays.toString(groceryList));
        System.out.println(fancyList);
    }
    
}
