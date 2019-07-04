public class Human {
    String name;
    int age;
    Eyeclour eyeclour;
    Haircolour haircolour;

    public Human(String name, int age, Eyeclour eyeclour, Haircolour haircolour) {
        this.name = name;
        this.age = age;
        this.eyeclour = eyeclour;
        this.haircolour = haircolour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eyeclour getEyeclour() {
        return eyeclour;
    }

    public Haircolour getHaircolour() {
        return haircolour;
    }

    public static void main(String args[]){
        Human lukas = new Human("Lukas",26,Eyeclour.BLUE, Haircolour.BLONDE);
        System.out.println(lukas.toString());
    }

    @Override
    public String toString() {
        return "Imie: " + this.getName() + " Mam lat " + this.getAge() + " Kolor oczu " + this.getEyeclour() + " Wlosy koloru " + this.getHaircolour();
    }
}
