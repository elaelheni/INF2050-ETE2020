import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;


import static org.junit.jupiter.api.Assertions.*;

class DiskFileTest {
    private Path workingDir;


    @BeforeEach
    public void init(){
        this.workingDir = Path.of("", "./src/main/resources");
    }



    @Test
    public void loadFileIntoStringTest() throws IOException {
        Path file = this.workingDir.resolve("employe.json");
        String content = Files.readString(file);
        assertEquals(content, DiskFile.loadFileIntoString(file.toString()));

    }



}