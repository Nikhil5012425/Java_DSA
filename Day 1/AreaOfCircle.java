import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius ");
        int r = sc.nextInt();
        double area = 3.14*3.14*r;
        System.out.println("area of circle is " + area);
    }
}