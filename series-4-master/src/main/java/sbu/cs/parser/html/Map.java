package sbu.cs.parser.html;
public class Map {

    private String key;
    private String value;

    // constructor
    public  Map(String key, String value) {
        this.key = key;
        this.value = value;
    }

    // getter
    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    // setter

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
