import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static final StringBuilder LOGGER = new StringBuilder();

    public static void main(String[] args) {
        createDir(new File("C:\\Games\\src"));
        createDir(new File("C:\\Games\\res"));
        createDir(new File("C:\\Games\\savegames"));
        createDir(new File("C:\\Games\\temp"));
        createDir(new File("C:\\Games\\src\\main"));
        createDir(new File("C:\\Games\\src\\test"));
        createFile(new File("C:\\Games\\src\\main\\Main.java"));
        createFile(new File("C:\\Games\\src\\main\\Utils.java"));
        createDir(new File("C:\\Games\\res\\drawables"));
        createDir(new File("C:\\Games\\res\\vectors"));
        createDir(new File("C:\\Games\\res\\icons"));
        createFile(new File("C:\\Games\\temp\\temp.txt"));
        try (FileWriter writer = new FileWriter("C:\\Games\\temp\\temp.txt", true)) {
            writer.write(LOGGER.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createDir(File file) {
        if (file.mkdir()) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            LOGGER.append("Create dir : ").append(file.getName()).append(" ").append(dateFormat.format(date)).append("\n");
        }
    }

    public static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                LOGGER.append("Create file : ").append(file.getName()).append(" ").append(dateFormat.format(date)).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}