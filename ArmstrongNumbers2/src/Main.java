public class Main {
    public static void main(String[] args) {
        // we are trying to find Armstrong numbers between 100-999
        int digit1,digit2,digit3,temp;
        int result = 0;
        for(int number = 100; number <= 999; number++)
        {
            temp = number;
            digit3=temp%10;// units digit
            temp=temp/10;// taking out the units digit

            digit2=temp%10;// tens digit
            temp=temp/10;// taking out the tens digit

            digit1=temp%10;// and hundreds digit
            //Math.pow() is used for calculating the power of digit e.g. => digit1 * digit1 * digit1
            // first part the one as a sub second one as a sup(power)
            result=((int)Math.pow(digit1,3))+((int)Math.pow(digit2,3))+((int)Math.pow(digit3,3));

            if(number==result){
                System.out.println(number + " is an Armstrong Number");
            }
        }

        }
    }

