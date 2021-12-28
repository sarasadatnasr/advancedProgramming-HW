package sbu.cs.parser.html;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Node implements NodeInterface {
    private List<Node>children=new ArrayList<>();
    private String tag;

    public Node(String tag){ this.tag=tag;}
    public void addChildren (Node document){
        children.add(document);
    }



    /*
     * this function will return all that exists inside a tag
     * for example for <html><body><p>hi</p></body></html>, if we are on
     * html tag this function will return <body><p1>hi</p1></body> and if we are on
     * body tag this function will return <p1>hi</p1> and if we are on
     * p tag this function will return hi
     * if there is nothing inside tag then null will be returned
     */
    @Override
    public String getStringInside() {
        List<String> element = new ArrayList<>();
        String html = "";
        html = html.replace("\n\n", "\n");
        String[] tag = html.split("\n");
        return null;
    }

    /*
     *
     */
    @Override
    public List<Node> getChildren() {
        return null;
    }

    /*
     * in html tags all attributes are in key value shape. this function will get a attribute key
     * and return it's value as String.
     * for example <img src="img.png" width="400" height="500">
     */
    @Override
    public String getAttributeValue(String key) {return null;}

}