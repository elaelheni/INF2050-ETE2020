import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class Utf8File {

    public static String loadFileIntoString(String filePath) throws FileNotFoundException, IOException {
        return IOUtils.toString(new FileInputStream(filePath), "UTF-8");
    }

    public static void saveStringIntoFile(String filePath, String content) throws IOException {
        File f = new File(filePath);
        FileUtils.writeStringToFile(f, content, "UTF-8");
    }
}
