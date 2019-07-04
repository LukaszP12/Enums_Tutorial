import java.util.logging.Level;

class Test{
    public enum Level {
        HIGH,
        MEDIUM,
        LOW
    }

  // Java enum in if statements
    Level level = Level.HIGH;

    public static void main(String args[]) {

        for (Level level : Level.values()) {
            System.out.println(level);
        }

        Level level = Level.HIGH;

        if (level == Level.HIGH)
            System.out.println("The level is high");
        else if (level == Level.MEDIUM)
            System.out.println("The level is medium");
        else if (level == Level.LOW)
            System.out.println("The level is low");

        //toString
        String levelText = Level.HIGH.toString();
        System.out.println(levelText);

        //Enum printing
        System.out.println(Level.HIGH);

        Level level1 = Level.valueOf("HIGH");
        System.out.println(level.toString());


    }
}