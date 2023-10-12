public class RemoveSpacesFromString {
    public static char[] removeSpaces(String str){
        char[] res = new char[str.length()];
        char[] ch = str.toCharArray();

        int i =0;
        for(char c: ch){
            if(!Character.isWhitespace(c)){
                res[i] = c;
                i++;
            }

        }
        return res;
    }

    public static StringBuilder removeSpace(String str){
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        for(char c: ch){
           if(!Character.isWhitespace(c)){
               sb.append(c);
           }
        }
        return sb;
    }
    public static void main(String[] args) {
        String str = "apple is fruit";
//        System.out.println(removeSpaces(str));
        System.out.println(removeSpace(str));
    }
}
