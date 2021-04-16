public class Demo {
    // I still havnt figured out how to make a workspace in intelliJ
    //this class is me fiddling with unit conversions, wrapper and string methods as well as regEx

    public static void main (String args[]){
        String str1 = "A great escape";
        String str2 = "asdf-01-2wed";
        String str3 = "1234-45-4567";
        String str4 = "d234-35-a7861";
replace1(str1); //returns and displays str wit h"a"s replaced
replace2(str1);//working on above but with capitols...
        replace3(str1);
    replaceSmallNum(str4);
    }
    //str.replaceAll(regEx, replacement)
    /*RegEx - regular expression
        PMA - Pattern MAtching Algorithm
        [] - expression
        {} - length
        ^ - not
        ----
        [0-9]{5} - 5 digits
        [a-z]{4} - any word of length 4 and should be lowercase
        [A-Za-z]{3,7} - any word of min length 3 and max length 7
        [A-Z]{1,} - min 1 uppercase letter (max not specified)
        try : https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285
     */

    public static String replace1(String str){ //replace "a"
        String value = str.replaceAll("a","_");
        System.out.println(value);
        return value;
    }

    public static String replace2(String str){
        String value = str.replaceAll("[aA]{1}","_");
        System.out.println(value);
        return value;
    }

    public static String replace3(String str){
        String value = str.replaceAll("[0-9a-zA-Z]","*");
        System.out.println(value);
        return value;
    }
    public static String ssValidate(String str){
        String value = str.replaceAll("a","_"); //will eventually check if all numbers and dashes... for SS #
        System.out.println(value);
        return value;
    }
    public static String replaceSmallNum(String str) {
        String value = str.replaceAll("[0-4]", "5");
        System.out.println(value);
        return value;
    }

}
//need to figure out symbols...
//useful: https://www.javatpoint.com/regex
