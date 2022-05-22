import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double l1;
        Scanner input= new Scanner(System.in);
        System.out.print("Write the price without KDV \n");
        l1=input.nextDouble();
        if (l1>=1000)
            System.out.print("Rate of KDV = %8\nPrice with KDV = "+ (l1+l1*0.08)) ;
        else
            System.out.print("Rate of KDV = %18\nPrice with KDV = "+ (l1+l1*0.18)) ;;
    }
}
