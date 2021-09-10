/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;

/**
 *
 * @author sgonzalez
 */
public class JavaLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        String favoriteHoliday1;
        String favoriteHoliday2;
        String favoriteFood1;
        String favoriteFood2;
        String favoriteFood3;
        String favoriteFood4;
        String noun1;
        String noun2;
        String noun3;
        String adjective1;
        String adjective2;
        String adjective3;
        String verb1;
        String verb2;
        String pluralNoun1;
        String pluralNoun2;
        String famousPerson;
        String familyMember;
        String place;
        String object;
        String bodyPartPlural;
        String bodyPart;
        String name;
        int numberOne1 = 0;
        int numberTwo1 = 0;
        double numberOne2 = (double)0;
        double numberTwo2 = (double)0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello, what is your name?");
        name = sc.next();
        
        System.out.println("Hello, " + name + ". Pick your favorite HOLIDAY.");
        favoriteHoliday1 = sc.next();
                
        System.out.println("Pick a NOUN.");
        noun1 = sc.next();
        
        System.out.println("Pick a PLACE.");
        place = sc.next();
        
        System.out.println("Pick an OBJECT.");
        object = sc.next();
        
        System.out.println("Pick an ADJECTIVE.");
        adjective1 = sc.next();
        
        System.out.println("Pick a BODY PART or PLURAL.");
        bodyPartPlural = sc.next();
        
        System.out.println("Enter a WHOLE NUMBER that will add on later.");
        numberOne1 = sc.nextInt();
        
        System.out.println("Pick a VERB.");
        verb1 = sc.next();
        
        System.out.println("Pick another ADJECTIVE.");
        adjective2 = sc.next();
        
        System.out.println("Pick another NOUN.");
        noun2 = sc.next();
        
        System.out.println("Pick your favorite FOOD.");
        favoriteFood1 = sc.next();
        
        System.out.println("Pick a PLURAL NOUN.");
        pluralNoun1 = sc.next();
        
        System.out.println("Pick a FAMOUS PERSON.");
        famousPerson = sc.next();
        
        System.out.println("Enter in the second WHLOE NUMBER that will add on.");
        numberTwo1 = sc.nextInt();
        
        System.out.println("Pick another NOUN.");
        noun3 = sc.next();
        
        System.out.println("Enter a WHOLE NUMBER that will divid later on:");
        numberOne2 = sc.nextInt();
        
        System.out.println("Pick your second favorite FOOD.");
        favoriteFood2 = sc.next();
        
        System.out.println("Pick another BODY PART.");
        bodyPart = sc.next();
        
        System.out.println("Pick another VERB.");
        verb2 = sc.next();
        
        System.out.println("Pick a FAMILY MEMBER.");
        familyMember = sc.next();
        
        System.out.println("Pick your third favorite FOOD.");
        favoriteFood3 = sc.next();
        
        System.out.println("Enter in the second WHOLE NUMBER that will divid on:");
        numberTwo2 = sc.nextInt();
        
        System.out.println("Pick another ADJECTIVE.");
        adjective3 = sc.next();
        
        System.out.println("Pick another PLURAL NOUN.");
        pluralNoun2 = sc.next();
        
        System.out.println("Pick your fourth favorite FOOD.");
        favoriteFood4 = sc.next();
        
        System.out.println("Pick your second favorite HOLIDAY.");
        favoriteHoliday2 = sc.next();
        
        System.out.println("JavaLibs Complete");
        System.out.println("I can't believe it's already " + favoriteHoliday1 + "!");
        System.out.println("I can't wait to put on my " + noun1 + " and visit every " + place + " in my neighborhood.");
        System.out.println("This year, I am going to dress up as (a/an) " + object + " with " + adjective1 + " " + bodyPartPlural + ".");
        System.out.println("Before I " + verb1 + ", I need to make sure to grab my " + adjective2 + " " + noun2 + " to hold all of my " + favoriteFood1 + ".");
        System.out.println("Finally, all of my " + pluralNoun1 + " are ready to go!");
        System.out.println("When " + famousPerson + " answers the door, I say, " + noun3 + " or Treat!");
        System.out.println("Yum! I got (a/an) " + favoriteFood2 + " and (a/an) " + favoriteFood3 + ".");
        System.out.println("We visit " + numberOne2 / numberTwo2 + " houses and decided it's time to " + verb2 + " home.");
        System.out.println("My " + familyMember + " says if I eat too much " + favoriteFood4 + ",");
        System.out.println("my " + bodyPart + " will hurt, so I'll eat just " + numberOne1 + numberTwo1 + " pieces and go straight to bed.");
        System.out.println("I hope I'll have " + adjective3 + " dreams of " + pluralNoun2 + " tonight!");
        System.out.println("Happy " + favoriteHoliday2 + "!");
    }
}
