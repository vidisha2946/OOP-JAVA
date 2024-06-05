import java.util.Scanner;

public class TimeZone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year no: ");
        int year = sc.nextInt();
        System.out.println("enter month no: ");
        int month = sc.nextInt();
        System.out.println("enter day no: ");
        int day = sc.nextInt();
        System.out.println("enter hour no: ");
        int hour = sc.nextInt();
        System.out.println("enter min no: ");
        int min = sc.nextInt();
        // hour+=5;
        // min+=30;
        if(month>=12){
            year++;
            month-=12;
        }
        if(day>=30){
            month++;
            day-=30;
        }
        if(min >= 60){
            hour++;
            min-= 60;
        }
        if(hour>=24){
            day++;
            hour-=24;
        }

            System.out.println("year : "+year+" , month : "+month+" , day : "+day+", hour : "+hour+", min : "+min);
        }
    }
