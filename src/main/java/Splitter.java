import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Splitter {
    public String[] read(String path) {
        try {
            String numbers = Files.readString(Path.of(path));
            return getStrings(numbers);
        } catch (IOException e) {
            System.err.println("Файл не открывается или не может быть прочитан");
        }
        return null;
    }


    public String[] getStrings(String numbers) {
        String[] num = numbers.split("\\s+");
        try {
            for (int i = 0; i < num.length; i++) {
                Integer count = Integer.parseInt(num[i]);
                if ((count % 3 == 0) && (count % 5 != 0)) {
                    num[i] = "Fizz";
                }
                if ((count % 3 != 0) && (count % 5 == 0)) {
                    num[i] = "Buzz";
                }
                if ((count % 3 == 0) && (count % 5 == 0)) {
                    num[i] = "FizzBuzz";
                }
            }
        } catch (NumberFormatException ex) {
            System.err.println("Неправильный формат \nФайл содержит буквы.");
            throw ex;
        }
        return num;
    }
}
