public class demo {
    public static void main(String[] args) {
        for(int i =0; i<5; i++){
            System.out.println(i + " test");
            if (i==2){
                System.out.println("break");
//                break;
                continue;

            }
            System.out.println("still test");
        }
        System.out.println("outside of for loop");

        String a = "cheese";
        switch (a) {
            case "cabbage":
                System.out.println("1");
            case "cheese":
                System.out.println("2");
        }
//        boolean b = true;
//        switch (b) {
//            case true:
//                System.out.println("1");
//            case false:
//                System.out.println("2");
//        } //

    }
}
