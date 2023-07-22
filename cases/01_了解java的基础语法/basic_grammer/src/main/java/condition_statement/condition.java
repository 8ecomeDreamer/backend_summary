package condition_statement;

public class condition {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("条件语句");
        System.out.println("=============================================");
        System.out.println("利用while语句,计算2+4+6+....+100");
        int i = 0;int sum =0;
        while(i<=100){
            if(i%2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("最终值为:"+sum);
        System.out.println("=============================================");
        System.out.println("利用for语句,计算1+3+5+....+99");
        int i2,sum2 =0;
        for(i2=1;i2<100;i2=i2+2){
            sum2 += i2;
        }
        System.out.println("最终值为:"+ sum2);
        System.out.println("=============================================");
        System.out.println("水仙花树是指其个位、十位和百位3个数的平方和等于这个三位数本身，求所有的水仙花数。");
        int tree = 100;int treeSet = 0;
        while (tree < 1000){
            int hundred = tree / 100; //百位
            int tens = tree / 10 - hundred * 10; //十位
            int unit = tree % 10; // 十位
            if (tree == hundred * hundred * hundred +  tens*tens*tens + unit*unit*unit ){
                treeSet ++;
            }
            tree ++;
        }
        System.out.println("水仙花数为:"+ treeSet);
        System.out.println("=============================================");
        System.out.println("地球的半径为6400km,一长跑健将将9.8s跑了100m,那么他以该速度绕赤道一圈，需要几天的时间");
        double s, meterPerDay, dayCount = 0;
        long r = 6400 * 1000;
        s = 3.1415926 * 2 * r;
        meterPerDay = 24 * 60 * 60 *100/9.8;
        dayCount = s / meterPerDay;
        System.out.println("需要时间为:"+ dayCount);
        System.out.println("=============================================");
    }
}
