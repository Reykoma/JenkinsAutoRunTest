import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello World!");

        File dir1 = new File("C:\\Users\\SykaBlyat\\Desktop\\create4.txt");
        dir1.createNewFile();
    }
}
