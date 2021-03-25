import java.util.Scanner;

public class Avgmarks {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int phy = scan.nextInt();
        int chem = scan.nextInt();
        int math = scan.nextInt();
        if (phy>60 && chem>60 && math>60){
            System.out.println("Passed");
        }
        else if (((phy+chem)>120) || ((math+chem)>120) || ((math+phy)>120)){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Failed");
        }
    }
}