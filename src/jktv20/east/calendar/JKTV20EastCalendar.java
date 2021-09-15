/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20.east.calendar;

import java.util.Scanner;

/**
 *
 * @author Владимир
 */
public class JKTV20EastCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year;
        year = scanner.nextInt();
        System.out.printf("year is %d%n", year);
        
        int year_position = (year%12);
        String color = "";
        String name = "";
        int year_color_position = (year%10);
        switch (year_position){
            case 0:
             name = "обезьяны";
             break;
            case 1:
             name = "петуха";
             break;
            case 2:
             name = "собаки";
             break;
            case 3:
             name = "свиньи";
             break;
            case 4:
             name = "крысы";
             break;
            case 5:
             name = "быка";
             break;
            case 6:
             name = "тигра";
             break;
            case 7:
             name = "кролика";
             break;
            case 8:
             name = "дракона";
             break;
            case 9:
             name = "змеи";
             break;
            case 10:
             name = "лошади";
             break;
            case 11:
             name = "козы";
             break;
        }
        switch(year_color_position){
            case 0: case 1:
             color = "белого";
             break;
            case 2: case 3:
             color = "черного";
             break;
            case 4: case 5:
             color = "синего";
             break;
            case 6: case 7:
             color = "красного";
             break;
            case 8: case 9:
             color = "желтого";
             break;
        }
        String answer = "год "+name+" "+color+" цвета";
        System.out.println(answer);
    }
    
}
