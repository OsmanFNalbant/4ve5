import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=4, c=5;
    for(int i=1; i<a; i++)
    {
        System.out.println("4'nin "+ i +". kuvveti:"+b);
        b *= b;
    }
        for(int i=1; i<a; i++)
        {
            System.out.println("5'nin "+ i +". kuvveti:"+c);
            c *= c;
        }
    }
}