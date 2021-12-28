package sbu.cs.parser.json;
import java.util.ArrayList;
import java.util.List;
public class JsonParser {
    /*
    * this function will get a String and returns a Json object
     */
    public static Json parse(String data) {
        List<String> key = new ArrayList<String>();
        List<String> value = new ArrayList<String>();
        data = data.replaceAll(" ", "");
        data = data.replaceAll("\n", "");
        data = data.replaceAll("\t", "");
        data = data.replace("{", "");
        data = data.replace("}", "");
        data = data.replaceAll("],", "]:");
        data = data.replaceAll(",\"", ":\"");
        data = data.replaceAll(",", ", ");

        String[] string = data.split(":");
        ArrayList<Map>keyvalue=new ArrayList<>();
        int count = count(data, ':');
        for (int i = 0; i < count + 1; i++) {
            if (i % 2 == 0) {
                string[i] = string[i].replace("\"", "");
                key.add(string[i]);
            } else {
                string[i] = string[i].replace("\"", "");
                value.add(string[i]);
            }
        }
        for(int j=0,i=0;j< key.size()&&i< value.size();j++,i++){
            keyvalue.add(new Map(key.get(j),value.get(i)));
        }



        Json Map1=new Json(keyvalue);
        return Map1;
        }

    public static int count (String s,char c){
        int num = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c)
                num++;
        return num;
    }
    /*
    * this function is the opposite of above function. implementing this has no score and
    * is only for those who want to practice more.
     */
    public static String toJsonString(Json data) {
        return null;
    }
}
