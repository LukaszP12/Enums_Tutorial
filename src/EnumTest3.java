public class EnumTest3 {
    //Add fields to a Java enum. Thus, each constant enum value gets these fields.
    //The field values must be supplied to the constructor of the enum when defining
    //the constants

    public enum Level{
        HIGH (3), //calls constructor with value 3
        MEDIUM (2), //calls constructor with value 2
        LOW (1) //calls constructor with value 1
        ; // semicolon needed when fields / methods follow

        private final int levelCode;

        private Level(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return this.levelCode;
        }



        }



    public static void main(String args[]){
        Level level = Level.HIGH;
        Level level2 = Level.MEDIUM;
        Level level3 = Level.LOW;

        System.out.println(level.getLevelCode());
        System.out.println(level2.getLevelCode());
        System.out.println(level3.getLevelCode());

        /*System.out.println(level.name());
         System.out.println(level2.name());*/

        for (Level l : Level.values()){
            System.out.println(l);
        }

        System.out.println(Level.valueOf("LOW"));
        System.out.println(Level.valueOf("HIGH"));

    }


}