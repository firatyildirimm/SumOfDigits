import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        int control=num;
        int numDigits=0;
        int total = 0;

        while(control!=0){
            control/=10;
            numDigits++;
        }
        for(int i=0;i<numDigits;i++){
            total += num%10;
            num /= 10;
        }
        System.out.println(total);
    }
}
