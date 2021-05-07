package clasification.children;

import clasification.parent.Animal;

public class Mammalia extends Animal
{
    public Mammalia(String scientificName )
    {
        super("Mammalia", "Animalia", scientificName, true);
    }
}