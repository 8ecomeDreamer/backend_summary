package method_statement;

public class method {
    static Boolean judgePrime(int num){
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("函数方法");
        System.out.println("=============================================");
        System.out.println("编写一个判断素数的方法。以整数作为参数，当该参数为素数时，输出true，否则输出false");
        int testNum = 9;
        System.out.println("这个数是素数的结果是：");
        System.out.println(judgePrime(testNum));
        System.out.println("=============================================");
    }
}
