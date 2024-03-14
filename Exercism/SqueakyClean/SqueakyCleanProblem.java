public class SqueakyCleanProblem {
    static String clean(String cleanedString) {
        cleanedString = cleanedString.replaceAll(" ","_");
        for(int i=0 ; i<cleanedString.length() ; i++){
            //Convert kebab - case to camelcase
            if(cleanedString.charAt(i) == '-') {
                cleanedString = cleanedString.substring(0,i) + cleanedString.substring(i+1,i+2).toUpperCase() + cleanedString.substring(i+2)   ;
            }
            //Convert leetspeak ro normal text
            if( Character.isDigit(cleanedString.charAt(i))){
                if(cleanedString.charAt(i) == '4') cleanedString = cleanedString.substring(0,i) + "a" + cleanedString.substring(i+1);
                else  if(cleanedString.charAt(i) == '3') cleanedString = cleanedString.substring(0,i) + "e" + cleanedString.substring(i+1);
                else  if(cleanedString.charAt(i) == '0') cleanedString = cleanedString.substring(0,i) + "o" + cleanedString.substring(i+1);
                else  if(cleanedString.charAt(i) == '1') cleanedString = cleanedString.substring(0,i) + "l" + cleanedString.substring(i+1);
                else if(cleanedString.charAt(i) == '7') cleanedString = cleanedString.substring(0,i) + "t" + cleanedString.substring(i+1);
            }
            //Omit
            if(!Character.isLetter(cleanedString.charAt(i)) && cleanedString.charAt(i) != '_'){
                cleanedString = cleanedString.substring(0,i) + cleanedString.substring(i+1);
                i--;
            }
        }
        return cleanedString;
    }
}
