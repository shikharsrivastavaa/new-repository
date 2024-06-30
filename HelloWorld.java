import org.w3c.dom.ls.LSOutput;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println(sumOfTwoNumbers(1,3));
        System.out.println("Difference of two Numbers: "+ diffOfTwoNumbers(2,3));
        System.out.println("Product of two numbers: "+productOfTwoNumber(2,3));
        printName();
        wifeName();
        childName();
    }

    public static int diffOfTwoNumbers(int a,int b){
        return Math.abs(a-b);
    }

    public static int sumOfTwoNumbers(int a, int b){
        return a+b;
    }

    public static int productOfTwoNumber(int a,int b){
        return a*b;
    }

    public static void printName(){
        System.out.println("Shah rukh khan");
    }



    public static void wifeName(){
        System.out.println("Gauri Khan");
    }

    public static void childName(){
        System.out.println("Aryan Khan");
    }

    public static void testFunction(){
        System.out.println("This is a temp test function");
    }
    public static void testFunction2(){
        System.out.println("This is temp test function 2");
    }
    public static void testFunction3(){
        System.out.println("This is temp test function 3");
    }
    public static void testFunction4(){
        System.out.println("This is temp test function 4");
    }

    public static void testFunciton5(){
        System.out.println("This is temp test function 5");
    }

    public void testFunction6(){
        System.out.println("This is test function 6");
    }

    public void testFunction7(){
        System.out.println("This is temp test function 7");
    }

    public void testFunction8(){
        System.out.println("This is temp test function 8");
    }
}
