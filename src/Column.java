public class Column {
    private DataType type;
    private String value;

    // Integer constructor
    public Column(Integer value) {
        this.type = DataType.Integer;
        this.value = value.toString();
    }

    // Decimal constructor
    public Column(Double value) {
        this.type = DataType.Decimal;
        this.value = value.toString();
    }

    // String constructor
    public Column(String value) {
        this.type = DataType.String;
        this.value = value;
    }

    // NULL constructor
    public Column(DataType type) {
        this.type = type;
        this.value = "NULL";
    }

    public String getValue() {
        return value;
    }

    public DataType getType() {
        return type;
    }
}