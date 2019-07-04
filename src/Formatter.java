public enum  Formatter {
    CALM {
        public String format(String message) {
            return "Here is your message: " + message;
        }
    },
    NERVOUS {
        public String format(String message) {
            return "STOP BOTHERING ME WITH YOUR MESSAGE " + message + "I'M NOT GOING TO ACCEPT ANYMORE";
        }
    };

    public abstract String format(String message);


    public static void main(String args[]){
        System.out.println(Formatter.CALM.format("I am glad to me you"));
        System.out.println(Formatter.NERVOUS.format("Go away"));
    }

}
