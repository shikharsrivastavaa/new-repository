public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("Difference of two Numbers: "+ diffOfTwoNumbers(2,3));
    }

    public static int diffOfTwoNumbers(int a,int b){
        return Math.abs(a-b);
    }
}
