public class TestRun {
    public static void tests(){
        String sim25 = "Stringlongatthat25simbols";
        System.out.println(StringCutter.stringCutter(sim25));
        String empty = "";
        System.out.println(StringCutter.stringCutter(empty));
        String sim26 = "Stringlongathat 26 simbols";
        System.out.println(StringCutter.stringCutter(sim26));
        String sim25wspc = "Stringlong that25 simbols";
        System.out.println(StringCutter.stringCutter(sim25wspc));
        String longLongStr = "Superlonglongstringwithoutspaces";
        System.out.println(StringCutter.stringCutter(longLongStr));
        String twoWords = "Not enough";
        System.out.println(StringCutter.stringCutter(twoWords));
        String yourTest = "Volvo released a new car with the following spec: V6 236HP. It will cost $22647 and going to be sold in New York only";
        System.out.println(StringCutter.stringCutter(yourTest));
    }
}
