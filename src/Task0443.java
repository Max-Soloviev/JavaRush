import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

/* 
Как назвали, так назвали
*/

public class Task0443 {
    public static void main(String[] args) throws Exception {
        int y = 0;
        int m = 0;
        int d = 0;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Напишите год вашего рождения");

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sY = reader.readLine();
            y = Integer.parseInt(sY);
        }
        while (y > year || y < (year - 100));

        System.out.println("Напишите месяц вашего рождения");

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sM = reader.readLine();
            m = Integer.parseInt(sM);
        }
        while (m > 12 || m < 1);

        System.out.println("Напишите день вашего рождения");

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sD = reader.readLine();
            d = Integer.parseInt(sD);
        }
        while (d > 31 || d < 1);

        System.out.println("Напишите ваше имя");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y + ".");

    }
}