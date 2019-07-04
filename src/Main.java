//Enum is a special class that defines a set of constants
// Variables of that type must be equal to one of the constant value that have been predefined

// Enum constants are implicitly static and final
// Enums are easy to read / compiler can catch errors

//When to use enumerations - when you need to represent a fixed set of constants

public class Main {

    public enum Season {SPRING, SUMMER, FALL, WINTER}


    public class Season2
    {
        public static final int SPRING = 0;
        public static final int SUMMER = 1;
        public static final int FALL = 2;
        public static final int WINTER = 3;

    }

// static method available to all enums - values
    // it returns an array containing all of the values of
    // the enum type in the order they are declared

    public static void main(String args[]){

        for  ( Season season : Season.values())
        {
            System.out.println(season);
        }

    EnumTest.Kolor kolor = EnumTest.Kolor.CZERWONY;

        if(kolor.equals(EnumTest.Kolor.CZERWONY))
            System.out.println("Zgadza się");

        if (kolor.equals(EnumTest.Kolor.NIEBIESKI))
            System.out.println("Zgadza się");
        else
            System.out.println("Nie zgadza się");

    }

    // Prosty enumm
    public enum Kolor {
        CZERWONY,ZIELONY,NIEBIESKI;
    }






}
