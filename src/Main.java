import java.util.Scanner;

public class Main {
    static int binarysearch(int[] nums, int secretvalue, int first, int last,int counter) {

        if (first <= last) {
            int middle = (first + last) / 2;
            if (secretvalue == nums[middle]) {
                System.out.println("The guess is : " + nums[middle]);
                System.out.println("Correct!");
                System.out.println("It took "+counter+" guesses.");
                return middle;

            } else if (secretvalue < nums[middle]) {
                System.out.println("The guess is:" + nums[middle]);
                System.out.println("Too High!");
                return binarysearch(nums, secretvalue, first, middle-1,counter+1);

            } else {
                System.out.println("The guess is: " + nums[middle]);
                System.out.println("Too Low!");
                return binarysearch(nums, secretvalue, middle + 1, last,counter+1);

            }
        } else {
            return -1;
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximumrange1 = 10;
        int maximumrange2 = 100;
        int maximumrange3 = 1000;
        System.out.println("Enter the end range " + maximumrange1 + ", " + maximumrange2 + " or " + maximumrange3 + ":");
        int input = scanner.nextInt();
        if (input == maximumrange1) {
            int randomNumber = (int) (Math.random() * input) + 1;
            System.out.println("The 'secret' number is: "+randomNumber);
            int[] num = new int[10];
            int countnumberofguesses=1;
            int first=0;
            int last=9;
            int index = 0;
            int count = 1;
            while (index < num.length) {
                num[index] = count;
                count++;
                index++;
            }
            int divideconquerfunction =binarysearch(num,randomNumber,first,last,countnumberofguesses);
            System.out.println(divideconquerfunction);


        }
        else if (input == maximumrange2) {
            int randomNumber = (int) (Math.random() * input) + 1;
            System.out.println("The 'secret' number is: "+randomNumber);
            int[] num = new int[100];
            int countnumberofguesses=1;
            int first=0;
            int last=99;
            int index = 0;
            int count = 1;
            while (index < num.length) {
                num[index] = count;
                count++;
                index++;
            }
            int divideconquerfunction =binarysearch(num,randomNumber,first,last,countnumberofguesses);
            System.out.println(divideconquerfunction);


        } else if (input == maximumrange3) {
            int randomNumber = (int) (Math.random() * input) + 1;
            System.out.println("The 'secret' number is: "+randomNumber);
            int[] num = new int[1000];
            int countnumberofguesses=1;
            int first=0;
            int last=999;
            int index = 0;
            int count = 1;
            while (index < num.length) {
                num[index] = count;
                count++;
                index++;
            }
            int divideconquerfunction =binarysearch(num,randomNumber,first,last,countnumberofguesses);
            System.out.println(divideconquerfunction);
        } else {
            System.out.println("Please enter the valid the range!");
        }

    }
}
