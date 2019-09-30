package homework;

public class A {
    public void print(){
        System.out.println("Hello");
    }
    int x;
    public void plus(){
        System.out.println(x+12);
    }
    public void isEven(){
        if (x%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static class B{
        int y;

    }
    int y_1;
    public void plusplus(){
        int sum=x+y_1;
        System.out.println(sum);
    }

}
