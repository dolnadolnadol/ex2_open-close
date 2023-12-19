import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        getValidIntegers(inp, nums);

        System.out.println("what sort do you want to select? [1: mergesort, 2:Insertsort, 3:selectsort]");

        int select = inp.nextInt();

        SortingAlgorithm sortingAlgorithm = null;

        if (select == 1) {
            sortingAlgorithm = new MergeSort();
        } else if (select == 2) {
            sortingAlgorithm = new InsertionSort();
        } else if (select == 3) {
            sortingAlgorithm = new SelectionSort();
        } else {
            System.exit(-1);
        }

        inp.close();

        if (sortingAlgorithm != null) {
            sortingAlgorithm.sort(nums);
            displaySortedNumbers(nums);
        }else{
            System.exit(-1);
        }
    }

    private static void getValidIntegers(Scanner inp, List<Integer> nums) {
        while (nums.size() < MAX) {
            String s = inp.nextLine();

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
                continue;
            }
            int num = Integer.parseInt(s);

            if (num < 0 || num > 10) {
                System.out.println("Invalid range! Try again!");
                continue;
            }
            nums.add(num);
        }
    }

    private static void displaySortedNumbers(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}
