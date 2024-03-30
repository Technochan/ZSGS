

public class SqueakyCleanProblem {
    static String clean(String cleanedString) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<cleanedString.length() ; i++){
            if(cleanedString.charAt(i) == ' ') sb.append("_");
            else if(cleanedString.charAt(i) == '-') {
                i++;
                sb.append((cleanedString.charAt(i)+"").toUpperCase());
            }
            else if(cleanedString.charAt(i) == '4') sb.append("a");
            else if(cleanedString.charAt(i) == '3') sb.append("e");
            else if(cleanedString.charAt(i) == '0') sb.append("o");
            else if(cleanedString.charAt(i) == '1') sb.append("l");
            else if(cleanedString.charAt(i) == '7') sb.append("t");
            else if(Character.isLetter(cleanedString.charAt(i))) sb.append(cleanedString.charAt(i));
        }
        return sb.toString();
    }
}
