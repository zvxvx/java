package cscd211classes;

/**
 * Represents a bird with a name, species, and weight.
 * Name and species are Strings.
 * Weight is an int.
 */
@SuppressWarnings("ClassCanBeRecord")
public class Bird implements Comparable<Bird> {

    private final String name;
    private final String species;
    private final int weight;

    /**
     * Constructs a Bird object with the specified name, species, and weight.
     *
     * @param name    The name of the bird.
     * @param species The species of the bird.
     * @param weight  The weight of the bird in grams.
     */
    public Bird(String name, String species, int weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    /**
     * Gets the name of the bird.
     *
     * @return The name of the bird.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the species of the bird.
     *
     * @return The species of the bird.
     */
    public String getSpecies() {
        return this.species;
    }

    /**
     * Gets the weight of the bird.
     *
     * @return The weight of the bird in grams.
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Prints a string describing the Bird object.
     * Sample output: Bird [Name=Parrot, Species=Macaw, Weight=500g]
     *
     * @return a String containing each Bird attribute in the given format above.
     */
    @Override
    public String toString() {
        return "Bird [Name=" + this.name + ", Species=" + this.species + ", " +
                "Weight=" + this.weight + "g]";

    }

    @Override
    public int compareTo(Bird bird) {
        if (this.weight < bird.getWeight()) {
            return -1;
        } else if (this.weight > bird.getWeight()) {
            return 1;
        }
        return 0;
    }
}
