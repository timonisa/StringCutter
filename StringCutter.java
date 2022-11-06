public class StringCutter {
    public static String stringCutter(String inputStr){
        StringBuilder resultString;
        int index = 0;
        String[] words = inputStr.split(" ");
        if(inputStr.length()>25 && words.length > 1) {
            resultString = new StringBuilder(words[index]);
            while (resultString.length() < 22) {
                index += 1;
                resultString.append(" ").append(words[index]);
            }
            if (resultString.length()>22){
                resultString = new StringBuilder(resultString.substring(0, (resultString.length() - words[index].length())));
            }
            resultString.append("...");
            return String.valueOf(resultString);
        } else if(inputStr.length()>25 && words.length == 1){
            resultString = new StringBuilder(words[index]);
            resultString = new StringBuilder(resultString.substring(0, 22));
            resultString.append("...");
            return String.valueOf(resultString);
        } else {
            return inputStr;
        }
    }
}
