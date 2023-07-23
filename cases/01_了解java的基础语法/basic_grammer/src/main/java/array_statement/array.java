package array_statement;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class array {
    /**
     * 排序数组
     */
    public static void sortTenNumber() {
        int arr [] = new int[10]; // 初始化数组
        Random random = new Random(); // 生成随机数
        System.out.print("排序前:");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        // 冒泡排序
        // 第一层找被对比的元素 第二层找对比的元素
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp;
                    // 交换
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("排序后:");
        for (int i = 0; i <arr.length ; i++) {  // 遍历输出数组
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    /**
     * 打印杨辉三角形
     * @param num 杨辉三角形数组的长度
     *
     */
    public static void printYHTriangle(int num) {
        int arr [][] = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 1;
                if(j>0){
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void reversArray() {
        System.out.println("请输入10个整数:");
        Scanner input=new Scanner(System.in);
        //创建一个数组
        int[] array=new int[10];int temp;
        //遍历数组，并给其赋值
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        System.out.println("翻转前:");
        //打印数组
        for(int i:array){
            System.out.print(i+" ");
        }
        for (int i = 0; i < Math.round(array.length/2); i++) {
            temp = array[i];
            array[i] = array[9-i];
            array[9-i] = temp;
        }
        System.out.println("翻转后:");
        //打印数组
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("数组");
        System.out.println("=============================================");
        System.out.println("编程对10个整数进行排序");
        sortTenNumber();
        System.out.println("=============================================");
        System.out.println("打印杨辉三角形");
        printYHTriangle(10);
        System.out.println("=============================================");
        System.out.println("将数组前五个元素与后五个元素互换");
        reversArray();
        System.out.println("=============================================");
    }
}
