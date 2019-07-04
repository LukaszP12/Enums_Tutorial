public enum  Computation {
    ADDITION{
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACTION{
        public double perform(double x, double y) {
            return x + y;
        }
    },
    MULTIPLICATION{
        public double perform(double x, double y) {
            return x + y;
        }
    },
    DIVISION{
        public double perform(double x, double y) {
            return x + y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String args[]){
        System.out.println("3 + 4 = " + (int)Computation.ADDITION.perform(3,4));
        System.out.println("3 - 4 = " + (int)Computation.SUBSTRACTION.perform(3,4));
        System.out.println("3 * 4 = " + (int)Computation.MULTIPLICATION.perform(3,4));
        System.out.println("3 / 4 = " + (int)Computation.DIVISION.perform(3,4));
    }

}
