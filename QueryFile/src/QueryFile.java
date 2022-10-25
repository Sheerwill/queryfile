public class QueryFile {
    public static void main(String[] args){
        System.out.println(decryptString("BMT GTB TGN QQB TGN SYM TGJ TGJ QTG JHY TGN TGT Sxx", 5));
    }
    public static String ungroupify(String str){
        str = str.replaceAll("\\s", "");
        str = str.replaceAll("x", "");
        return str;
    }
    public static String unCaesarify(String str, int shiftValue){
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            int newCharUnicode = (int)(str.charAt(i)) - shiftValue;
            if(newCharUnicode < (int)'A'){
                newCharUnicode = ((int)'Z' + 1) + (newCharUnicode - (int)'A');
                char newChar = (char)newCharUnicode;
                result += newChar;
            }else{
                char newChar = (char)newCharUnicode;
                result += newChar;
            }

        }
        return result;
    }
    public static String unObify(String str){
        String unObified = str.replaceAll("OB", "");
        return unObified;
    }

    public static String decryptString(String str, int shiftValue){
        String ungroupified = ungroupify(str);
        String unCaesarified = unCaesarify(ungroupified, shiftValue);
        String unObified = unObify(unCaesarified);
        return unObified;
    }
}

