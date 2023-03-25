public class Main {
    public static void main(String[] args) {
        // we are trying to find Armstrong numbers between 100-999
        int digit1,digit2,digit3,temp;
        int result = 0;
        for(int number = 100; number <= 999; number++)
        {
            temp = number;
            digit3=temp%10;//3
            temp=temp/10;//12

            digit2=temp%10;//2
            temp=temp/10;//1

            digit1=temp%10;//1
            result=((int)Math.pow(digit1,3))+((int)Math.pow(digit2,3))+((int)Math.pow(digit3,3));

            if(number==result){
                System.out.println(number + " is an Armstrong Number");
            }
        }

        }
    }

