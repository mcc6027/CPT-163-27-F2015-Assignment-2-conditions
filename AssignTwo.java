/*
 *Calvin McCoy
 *Assignment 2
 *09/04/2015
 */
package assigntwo;

import java.util.Scanner;

public class AssignTwo {

    
    public static void main(String[] args) {
        Scanner option;
        System.out.println("Welcome!");
        System.out.println("Choose an Option:");
        System.out.println ( "1) Character Counter \n2) Adventure Time! \n3) Number Counter" );
        option = new Scanner(System.in);
        switch (option.nextInt()){
            case 1:
              //assign characters
            char ch1,ch2,ch3,ch4,ch5;
        
            ch1 = 'r';
            ch2 = 'é';
            ch3 = 's';
            ch4 = 'u';
            ch5 = 'm';
        
        //print word
            System.out.println("My Word is...");
            System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4
            + "" + ch5 + "" + ch2 + "" + ch3);
         
        //convert characters to integers and find the sum
            int chValue;
            chValue = ch1 + ch2 + ch3 + ch4 + ch5 + ch2 + ch3;
            System.out.println("My word's value is...");
            System.out.println(chValue);
            break;
       
        case 2:
            System.out.println("Who's Your Favorite Adventure Time Character?");
            System.out.println ( "1) Finn \n2) Jake \n3) Lemongrab \n4) Princess Bubblegum \n5) Marceline" );
            System.out.print("Choose a number: ");
            Scanner choice = new Scanner(System.in);
            switch(choice.nextInt()){
            case 1:
                System.out.println("Mathematical!");
                break;
            case 2:
                System.out.println("Easy Peesy, Livin' Greasy!");
                break;
            case 3:
                System.out.println("UNNACCEPTABLEEE!");
                break;
            case 4:
                System.out.println("You so Spice!");
                break;
            case 5:
                System.out.println("Vampire Kick!");
                break;
            default:
                System.err.println("It's Probably a Computal Gleetch");
                break;
              }
        case 3:
            System.out.println("Can you count to 10?");
            System.out.println("WHo can count faster?");
            int number = 0;
            while (number < 10){
                System.out.println(number);
                    number++;
            System.out.println("I Win!");
                break;
                
            }
                
}
    }
    }