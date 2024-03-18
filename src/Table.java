import java.util.ArrayList;

public class Table {
    private String name;
    private String fileName;
    private ArrayList<Column> columns;

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void insertColumn(Column column){
        this.columns.add(column);
    }
}
