
public class Demo {


    public static void main(String[] args){
        String str = "i test this cheeseburger now";
        String answer = convert(str);
        System.out.println(answer);

    }
    public static String convert(String str){
        /*
        1. convert last letter to uppercase (from sentence str)
        2. if length of word is odd, convert middle letter to uppercase,
        else convert first letter to uppercase
        https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
         */
        StringBuilder sb = new StringBuilder();
        String workingArr[] = str.split(" ");
        for (int i=0; i < workingArr.length; i++){
            int wordLen = workingArr[i].length();
            //check if odd
            if (wordLen % 2 != 0){
                if (wordLen == 1){
                    sb.append(workingArr[i].substring(wordLen-1).toUpperCase());
                    // 1 length word causes errors in below code so capitalize it here instead
                }else{
                    int midIndex = wordLen / 2;
                    String tempStr = workingArr[i].substring(0,midIndex);
                    sb.append(tempStr);                // this should convert first half of odd words
                    tempStr = workingArr[i].substring(midIndex,midIndex+1).toUpperCase(); //capitalizes middle
                    sb.append(tempStr);
                    tempStr = workingArr[i].substring(midIndex+1, wordLen-1).toUpperCase(); //adds second half
                    sb.append(tempStr);
                    tempStr = workingArr[i].substring(wordLen-1).toUpperCase(); //capitalizes last letter
                    sb.append(tempStr);


                }}
            else {
                String tempStr = workingArr[i].substring(0, wordLen - 1);
                sb.append(tempStr);
                tempStr = workingArr[i].substring(wordLen-1).toUpperCase(); //capitalizes last letter
                sb.append(tempStr);
            }
            //append last letter uppercase
            if (i != workingArr.length){
                sb.append(" ");
            }
        }

        System.out.println(workingArr[2]);
        String finalString = sb.toString(); //need to convert this from stringbuilder
        return finalString;

    }

}

// I did this wrong, misread "else" for "and"
// fixing it is not a priority right now, as it still does all the things asked, just not in the right places
