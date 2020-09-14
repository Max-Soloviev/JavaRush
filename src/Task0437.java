/* 
Треугольник из восьмерок
*/

public class Task0437 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(8);
            for (int a = 1; a <= i; a++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}