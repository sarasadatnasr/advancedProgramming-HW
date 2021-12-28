package sbu.cs.parser.html;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSONFunctions;
import sbu.cs.parser.json.Map;
import java.util.Arrays;
import java.util.List;
public class HTMLParser {
    /*
     * this function will get a String and returns a Dom object
     */
    public static Node parse(String document) {
        Node node=new Node(document);
        while(document.contains("<")){
            node.addChildren(node);
    }
    return null;}



    /*
    * a function that will return string representation of dom object.
    * only implement this after all other functions been implemented because this
    * impl is not required for this series of exercises. this is for more score
     */
    public static String toHTMLString(Node root) {
        // TODO implement this for more score
        return null;
    }
}
}