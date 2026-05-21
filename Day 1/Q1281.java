import java.util.Scanner;
public class Q1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int s = 0;
        int p = 1;
        while(num>0){
            int r = num % 10;
            s = s + r;
            p = p*r;
            num = num/10;
        }
        System.out.println(p-s);
    }
}
