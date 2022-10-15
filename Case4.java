import java.util.Scanner;

public class Case4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = input.nextInt();
        double triangleNum = 0.5  * n * (n+1);
        System.out.print("Треугольное число " + n + " порядка: " + triangleNum);
        input.close();
    }
    
}
