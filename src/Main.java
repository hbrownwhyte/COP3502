public class Main {

    public static void main(String[] args) {
	    // This is for Lab 06 in COP 3502C Spring 2022
        // This lab is teaching us how to use Git and GitHub
        //This program will first add a couple numbers, and after changes, subtract two numbers.


        double numFirst = Math.random();
        double numSecond = Math.random();

        int totalSum = (int) ((numFirst + numSecond) * 100);

        //System.out.println("The sum of two random numbers is " + (totalSum) + "!");


        //Changing program to do subtraction
        int totalDiff = (int) (Math.abs(numFirst - numSecond) * 100);

        System.out.println("The absolute difference of two random numbers is " + (totalSum) + "!");



    }
}
