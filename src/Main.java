import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // First we need to find how many places does the number have?
        // we will divide the number with 10 ,but it will be in a loop
        // times that we run the loop will give us the places of the number
        // loop will be stopped when the division of our number is 0 so our condition
        // number / 10 !=0 don't forget to change the new value of number in the loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int choosenNum = scanner.nextInt();;
        int times = 0;
        int valOfDigPlace;
        int placePow ,replacedNum = choosenNum ,result = 0;
        // since we can't find a negative is an Armstrong or not we don't let the user enter it.
        while(choosenNum < 0){
            System.out.print("Please make the number is positive : ");
            choosenNum = scanner.nextInt();
        }

        // we changed choosenNum with replacedNum because we need to save the value for other transactions
        // if we don't we will lose its value
         while(replacedNum != 0){
               replacedNum /= 10;
              times ++;
           /*  System.out.println(replacedNum + " " + times);*/
         }
        replacedNum = choosenNum;

         while(replacedNum != 0){
             // with this part we were able to get the value of each place.
             valOfDigPlace = replacedNum % 10;
             placePow = 1;
             // in this loop we will be able to take the powers of the number's places
             for (int i = 1; i <= times; i++){
                 placePow *= valOfDigPlace;
             }
             result += placePow;
             replacedNum /= 10;
         }

         if(result == choosenNum){
             System.out.println(choosenNum + " " + "is an Armstrong Number!");
         }else{
             System.out.println(choosenNum + " " + "isn't an Armstrong Number!");
         }

    }
}