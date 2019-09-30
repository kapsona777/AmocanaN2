package homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        A A_1=new A();
        A_1.x=num.nextInt();
        A.B B_1=new A.B();
        B_1.y=num.nextInt();
        A_1.y_1=B_1.y;
        A_1.print();
        A_1.plus();
        A_1.isEven();
        A_1.plusplus();

    }


}
