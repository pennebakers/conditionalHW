import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        double x, y, z;

        System.out.println("Enter x: ");
        x = kbd.nextDouble();
        System.out.println("Enter y: ");
        y = kbd.nextDouble();
        System.out.println("Enter z: ");
        z = kbd.nextDouble();

        if(x < y && y < z){
            System.out.println("INCREASING");
        }
        else if(x > y && y > z){
            System.out.println("DECREASING");
        }
        else{
            System.out.println("NEITHER");
        }

    }
}