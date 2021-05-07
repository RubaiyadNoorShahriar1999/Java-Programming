package clasification.parent;

public class Animal
{
    private String className;
    protected String kingdom;
    protected String scientificName;

    protected boolean isAnimaliaKingdom;

    public Animal()
    {
        this.className = "";
        this.kingdom = "";
        this.scientificName = "";
        this.isAnimaliaKingdom = false;
    }

    public Animal( String className, String kingdom, String scientificName, boolean isAnimaliaKingdom )
    {
        this.className = className;
        this.kingdom = kingdom;
        this.scientificName = scientificName;
        this.isAnimaliaKingdom = isAnimaliaKingdom;
    }

    public void display()
    {
        System.out.println("# Clasification #");
        System.out.println("\tScientific Name: " + this.scientificName);
        System.out.println("\tKingdom: " + this.kingdom);
        System.out.println("\tClass: " + this.className);
        System.out.println("\tIs Animalia Kingdom?: " + this.isAnimaliaKingdom);
        System.out.println("\n");
    }
}