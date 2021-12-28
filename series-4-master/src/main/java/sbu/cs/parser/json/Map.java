package sbu.cs.parser.json;
public class Map {

        private String tag;
        private String element;

        // constructor
        public  Map(String tag, String element) {
            this.tag = tag;
            this.element = element;
        }

        // getter
        public String getTag() {
            return tag;
        }

        public String getElement() {
            return element;
        }
        // setter

        public void setTag(String key) {
            this.tag = tag;
        }

        public void setElement(String value) {
            this.element = element;
        }
    }
