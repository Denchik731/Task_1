package ru.mirea.task1;
import java.util.Scanner;
public class LabOne {
    public static void main(String[] args){
        // №5 Вывод аргументов комантной строки
        for(int j = 0; j<args.length; j++)
            System.out.println("Аргумет №"+j+": args["+j+"}="+args[j]);
        //***************************************************

        // №3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int sum =0;
        double srednee = 0;
        for (int i = 0; i < size; i++) {
            sum +=array[i];
        }
        srednee = sum/size;
        System.out.println("Sum: ");
        System.out.print (sum);
        System.out.print ("\n");
        System.out.println("Srednee arifmeticheskoe: ");
        System.out.print (srednee);
        System.out.print ("\n");
        //*********************************************************

        // №4
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size1 = input1.nextInt();
        int array1[] = new int[size1];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size1; i++) {
            array1[i] = input1.nextInt();
        }
        int i = 0;
        int sum1 = 0;
        while(i<=size1-1 ){
            sum1+= array1[i];
            i++;
        }
        var min = array1[0];
        for (int num : array1) {
            if (num < min) {
                min = num;
            }
        }
        var max = array1[0];
        for (int num : array1) {
            if (i >max) {
                max=i;
            }
        }
        System.out.println("Min_element: ");
        System.out.println(max);
        System.out.print ("\n");
        System.out.println("Max_element: ");
        System.out.println(min);
        System.out.print ("\n");
        System.out.println("Summa: ");
        System.out.print (sum1);
        System.out.print ("\n");
        System.out.println();
        System.out.print ("\n");
        //********************************************
        // 6. Гармонический ряд
        System.out.println("Garmonics number");
        for (int k = 1; k < 11; k++) {
            System.out.println(1./k);
        }

    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

}

