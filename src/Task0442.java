import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Task0442 {
    public static void main(String[] args) throws Exception {
        int num = 0;
        int sum = 0;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNum = reader.readLine();
            num = Integer.parseInt(sNum);
            sum = sum + num;
        }
        while (num != -1);
        System.out.println(sum);
    }
}