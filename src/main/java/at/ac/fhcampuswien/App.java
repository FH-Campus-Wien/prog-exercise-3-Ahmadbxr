package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int start){
        int x = 0, y = -1;
        for(int i = 0; i < days; i++){
            for(int j = 1; j < start && i == 0; j++){
                System.out.print("   ");
                y++;
            }
            y++;
            x++;
            if(y % 7 == 0) {
                System.out.println();
            }
            System.out.printf("%2d ", x);
        }
        System.out.println();
    }

    public static long[] lcg(long x_0){
        long[] x_i = new long[10];
        long m = (long) Math.pow(2,31),
            x = x_0;
        int a = 1103515245,
                c = 12345;

        for(int j = 0; j < x_i.length; j++){
            x = (a * x + c) % m;
            x_i[j] = x;
        }
        return x_i;
    }

    public static void guessingGame(int numberToGuess){
        int i = 1, y = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Guess number " + i + ": ");
            y = sc.nextInt();

            if (i == 10){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            } else if (y < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            } else if (y > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (y == numberToGuess) {
                System.out.println("You won wisenheimer!");
            }
            i++;
        } while(y != numberToGuess && i != 11);
    }

    public static int randomNumberBetweenOneAndHundred(){
        int RandomNumber = 1 + (int)(Math.random() * ((100 - 1) + 1));
        return RandomNumber;
    }
    public static boolean swapArrays(int [] a, int [] b){
        int[] temp = new int[a.length];
        if(a.length != b.length){
            return false;
        }

        for(int i = 0; i < a.length; i++){
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp[i];
        }
        return true;
    }

    public static String camelCase(String s){
        char[] satzArray = s.toCharArray();
        int y = 1;
        int i;

        for (i = 0; i < satzArray.length; i++){
            if (64 < satzArray[i] && satzArray[i] < 91){
                satzArray[i] = (char) (satzArray[i] + 32);
            }
        }

        satzArray[0] = (char) (satzArray[0] - 32);

        for (i = 0; i < satzArray.length; i++){
            if (32 == satzArray[i]){
                satzArray[i + 1] = (char)(satzArray[i + 1] - 32);
            }
        }

        for (i = 0; i < satzArray.length; i++){
            if (65 > satzArray[i] || satzArray[i] > 122 || (90 < satzArray[i] && satzArray[i] < 97)){
                for (int j = i; j <satzArray.length - 1; j++ ){
                    satzArray[j] = satzArray[j + 1];
                }
                y++;
            }
        }
        int newLength = satzArray.length - y / 2;
        char[] finalArray = new char[newLength];

        for(i = 0; i < newLength; i++){
            finalArray[i] = satzArray[i];
        }
        String Output = String.valueOf(finalArray);
        return Output;
    }

    public static int checkDigit(int [] a){
        int[] gewicht = new int[a.length];
        int[] produkt = new int[a.length];
        int sum = 0,modulo = 0, pruefziffer = 0;

        for(int i = 0; i < a.length; i++){
            gewicht[i] = i + 2;
            produkt[i] = a[i] * gewicht[i];
            sum = sum + produkt[i];
        }
        modulo = sum % 11;
        pruefziffer = 11 - modulo;

        if(pruefziffer == 10){
            pruefziffer = 0;
        }
        if(pruefziffer == 11){
            pruefziffer = 5;
        }
        return pruefziffer;
    }



    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}