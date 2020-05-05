public class Animal {

    private double weight;
    final String species;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = 10.00;
        } else if (species == "cat") {
            this.weight = 5.00;
        } else {
            System.out.println("Unknown species!");
        }
    }

    public void feed() {
        if (weight > 0) {
            weight -= 1.00;
            System.out.println(species + " weight = " + weight);
        } else {
            System.out.println("Your pet is dead. You are terrible owner!");
        }
    }

    public void takeForAWalk() {
        if (weight > 0) {
            weight -= 1.00;
            System.out.println(species + " weight = " + weight);
        } else {
            System.out.println("Your pet is dead. You are terrible owner!");
        }
    }
}

