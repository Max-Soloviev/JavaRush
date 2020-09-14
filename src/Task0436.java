import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Tasl0436 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sM = reader.readLine();
        int m = Integer.parseInt(sM);
        String sN = reader.readLine();
        int n = Integer.parseInt(sN);

        for ( int i = 1; i <= m; i++) {
            System.out.print(8);

            for (int t = 1; t < n; t++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}