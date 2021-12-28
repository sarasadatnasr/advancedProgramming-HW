package sbu.cs.parser.json;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Json implements JsonInterface {
   private ArrayList<Map>keys=new ArrayList<>();
    public Json(ArrayList keys){ this.keys=keys;}
    @Override
    public String getStringValue(String key) {
        for(int i=0;i<keys.size();i++){
            if(key.equals(keys.get(i).getKey())){
                return keys.get(i).getValue();
            }
        }
        return null;
    }
}
