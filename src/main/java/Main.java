import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Splitter splitter = new Splitter();
        String pa = "C:\\Users\\79061\\Desktop\\text.txt";
        if (args.length != 0) {
            Arrays.stream(splitter.read(args[0])).forEach(System.out::println);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь к файлу.");
            String path = scanner.nextLine();
            Arrays.stream(splitter.read(path)).forEach(System.out::println);
        }
    }
}
