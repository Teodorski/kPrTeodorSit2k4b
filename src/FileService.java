import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService implements IFileService {

    @Override
    public void saveFile(String fileName, String data) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
            writer.write(data + "\n");
            writer.close();
    }

    @Override
    public String getFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                content.append(line + "\n");
                line = reader.readLine();
            }
            reader.close();

        return content.toString();
    }

    @Override
    public boolean deleteFile(String fileName) {
        File file = new File(fileName);
        boolean isDeleted = false;
        if (file.exists()) {
            isDeleted = file.delete();
        }

        return isDeleted;
    }
}