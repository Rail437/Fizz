import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SplitterTest {

    Splitter splitter = new Splitter();

    @Test
    public void readTest(){
        String[] result = {"Fizz","Buzz","FizzBuzz"};
        String in = "3 5 15";

        assertEquals(result[0], splitter.getStrings(in)[0]);
        assertEquals(result[1], splitter.getStrings(in)[1]);
        assertEquals(result[2], splitter.getStrings(in)[2]);
    }

    @Test
    public void readerTest(){
        Assertions.assertDoesNotThrow( () -> splitter.read("lol"));
    }

    @Test
    public void formatTxt(){
        String test = "3 5 7 ffdf";
        assertThrows(NumberFormatException.class, () -> splitter.getStrings(test));
    }

}
