package hello;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author amsia
 */
public class Hello {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter out=new OutputStreamWriter(System.out);
        out.write("Hello World!");
        out.flush();
    }
}
