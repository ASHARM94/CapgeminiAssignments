import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
        int temp = number;
        int c=0,a;
        while(number>0){
            a = number%10;
            number = number/10;
            c = c +(a*a*a);
        }
        if (temp==c){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
