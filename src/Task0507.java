import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0507 {
    public static void main(String[] args) throws Exception {
        double num = 0;
        double sum = 1;
        double count = -1;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNum = reader.readLine();
            num = Integer.parseInt(sNum);
            sum = sum + num;
            count = count + 1;
        }
        while (num != -1);
        System.out.println(sum/count);
    }
}
