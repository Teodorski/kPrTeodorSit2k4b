import java.util.ArrayList;

public class DataBase {
    private ArrayList<Table> tables;

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public void insertTable(Table table){
        this.tables.add(table);
    }
}
