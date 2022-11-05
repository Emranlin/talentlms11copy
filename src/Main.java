import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Scanner scanner=new Scanner(System.in);
        triangle.a =scanner.nextInt();
        System.out.println("You entered integer " + triangle.a);
        triangle.b= scanner.nextInt();
        System.out.println("You entered integer " + triangle.b);
        triangle.c= scanner.nextInt();
        System.out.println("You entered integer " + triangle.c);
        System.out.println();

        triangle.area();

    }
}

