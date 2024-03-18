import java.io.IOException;

public interface IFileService {
    public void saveFile(String fileName, String data) throws IOException;
    public String getFile(String fileName) throws IOException;
    public boolean deleteFile(String fileName) throws IOException;
}
