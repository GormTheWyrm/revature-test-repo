import java.math.BigDecimal;

public class DoubleTrouble {

    public static void main(String[] args) {
        double a = 2.34;
        double b = 4.512;
        double c = a + b;
        System.out.println(b);
        System.out.println(b%.01);


        BigDecimal bigA= new BigDecimal(23.45);
//        System.out.println(bigA.add(BigDecimal(3)); //no bueno
        System.out.println(BigDecimal.valueOf(3L));
        int ex1 = 34;
        long ex2 = Long.valueOf(ex1);
        double ex3 = Double.valueOf(ex1);
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        double ex4 = ex3 + 0.00;
        System.out.println(ex4);




    }

}
