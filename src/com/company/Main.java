package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println("Your Name is :" + printName());
        //System.out.println(calcualateScore(110, 10));
        //System.out.println(calcualateScore(10000));
        System.out.println("Enter You Name:");
        Scanner scanInput=new Scanner(System.in);
        String stringInput=scanInput.nextLine();
        while((stringInput.compareTo("exit")!=0))
        {
            System.out.println("Enter You Name:");
             scanInput=new Scanner(System.in);
              stringInput=scanInput.nextLine();
        switch ( stringInput) {

            case "Sameer": {
                System.out.println("Sameer Rocks");
                break;
            }
            case "Sameena": {
                System.out.println("Sameena is lame");
                break;
            }
            default:{
                System.out.println("Wrong Name");
                break;
            }
        }
        int[] numberArray={1,2,3,4,5,6,7,8,9};
        for (int number:numberArray)
            {
              System.out.println(number);
            }

        }
    }

    public  static String printName(){
        System.out.println("Please enter your First Name:");
        Scanner scan=new Scanner(System.in);
        String firstName=scan.nextLine();
        System.out.println("Please enter your Last Name:");
        String lastName=scan.nextLine();

        return firstName+lastName;

    }

    public static int calcualateScore(int sumOfTeamMembers,int sizeOfTeam)
    {
     int calcScore=sumOfTeamMembers/sizeOfTeam;
     return calcScore;
    }

    public static int  calcualateScore(int sumOfTeamMembers)
    {
        int calcScore=sumOfTeamMembers/1;
        return calcScore;
    }


}
