package collection_com._23properties_class;

import java.io.FileWriter;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.setProperty("name", "Sonoo Jaiswal");
        p.setProperty("email", "sonoojaiswal@codemeals.com");

        p.store(new FileWriter("info.properties"), "codemeals Properties Example");

    }
} 