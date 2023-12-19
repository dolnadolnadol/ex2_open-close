import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");


        //getValdInteger
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
        inp.close();
        Collections.sort(nums);

        //displaySortedNumbers
        for (int num : nums)
            System.out.print(num + " ");
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