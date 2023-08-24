package method_statement;

public class method {
    /**
     * 判断素数
     * @param num
     * @return 返回是否为素数
     */
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

    /**
     * 找最大公约数和找最小公倍数
     * @param num1
     * @param num2
     * @return int
     */
    static void findDivisorAndMultipler(int num1, int num2){
        int divisor= 0, multipler= 0; // 最小公倍数和最大公约数
        int max = num1 > num2 ? num1 : num2;
        // 找最大公约数
        for (int i = max; i>0 ; i--) {
            if(num1 % i == 0 && num2 % i == 0){
                divisor = i;
                break;
            }
        }
        // 找最小公倍数
        for (int i = max; i<100000 ; i++) {
            if(i % num1 == 0 && i % num2 == 0){
                multipler = i;
                break;
            }
        }
        System.out.println("num1是:"+ num1 +"\t"+ "num2是:"+  num2);
        System.out.println("最大公约数是:"+ divisor +"\t"+ "最小公倍数是:"+  multipler);
    }

    /**
     * 计算阶乘
     * @param num
     * @return 返回阶乘数
     */
    static int calculateFactorial(int num){
        int result = 0;
        if(num == 0) return result;
        else {
            return num + calculateFactorial(num-1);
        }
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
        System.out.println("编写一个方法。求出两个数的最大公约数和最小公倍数");
        int randomNum1 = (int)(Math.random()*100 +1) * 5;
        int randomNum2 = (int)(Math.random()*100 +1) * 5;
        findDivisorAndMultipler(randomNum1,randomNum2);
        System.out.println("=============================================");
        System.out.println("计算阶乘");
        int facNum = 10;
        System.out.println(facNum + "的阶乘结果是:" +"\t"+calculateFactorial(facNum));
        System.out.println("=============================================");
    }
}
