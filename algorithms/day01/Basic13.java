import java.util.ArrayList;

public class Basic13 {

// TODO: print all integers from 1 to 100

public void printNumsto100(){
    for(int i = 1; i <= 100; i++){
        System.out.println(i);
    }
}

// TODO: print even integers from 0 to 100
public void printEvenNumsto100(){
    for(int i = 0; i <= 100; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
}

// TODO: given an array of integers, find its largest element

public int findLargest(int[] nums){
    int max = nums[0];
    for(int i = 1; i < nums.length; i++){
        if(max < nums[i]){
            max = nums[i];
        }
    }
    return max;

}

// TODO: create an array with all odd integers between 1 and 100(inclusive)

int[] numbers = {1,2,3,4};

public ArrayList<Integer> createOddArray(){
    int[] odds = {};
    ArrayList<Integer> easyOdds = new ArrayList<>();
    for(int i = 0; i <= 100; i++){
        if(i % 2 != 0){
            easyOdds.add(i);
        }
    }

    return easyOdds;
}

public int[] createOddCArray(){
    int[] odds = new int[55];
    // ArrayList<Integer> easyOdds = new ArrayList<>();
    int j = 0;
    for(int i = 0; i <= 100; i++){
        if(i % 2 != 0){
            odds[j]= i;
            j++;
        }
    }

    return odds;
}



// TODO: replace any negative array values with "dojo"

// TODO: find the average of a given array's values.
    
    
}
