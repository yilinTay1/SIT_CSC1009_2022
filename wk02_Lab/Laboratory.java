package wk02_Lab;

import java.util.Scanner;

public class Laboratory {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Programming Laboratory Wk02: Question 1
        System.out.print("Programming Laboratory Wk02: Question 1 \n");
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area;
        area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area + "\n");

        System.out.print("Enter a number for radius: ");
        double radius1 = input.nextDouble();
        double area1;
        area1 = radius1 * radius1 * PI;
        System.out.println("The area for the circle of radius " + radius1 + " is " + area1+ "\n");

        // Programming Laboratory Wk02: Question 2
        System.out.print("Programming Laboratory Wk02: Question 2 \n");
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1+number2+number3)/3;
        System.out.println("The average of " + number1 +" "+ number2+" " + number3 + " is " + average+ "\n");
       
        // Programming Laboratory Wk02: Question 3
        System.out.print("Programming Laboratory Wk02: Question 3 \n");
        float totalMilliseconds = System.currentTimeMillis();
        float totalSeconds = totalMilliseconds/1000;
        float currentSecond = totalSeconds%60;
        float totalMinute = totalSeconds/60;
        float currentMinute = totalMinute%60;
        float totalHours = totalMinute/60;
        float currentHours = totalHours%24; 

        System.out.println("Current time is "+(int)currentHours+":"+(int)currentMinute+":"+(int)currentSecond+" GMT"+ "\n");
        
        // Programming Laboratory Wk02: Question 4
        System.out.print("Programming Laboratory Wk02: Question 4 \n");
        System.out.print("Enter a year: ");
        int inputYear = input.nextInt();
        String[] zodiac = { "rooster", " dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", };
        int zodiacNum = inputYear % 12;
        System.out.println(zodiac[zodiacNum-1]+ "\n");
    }
}
