package animals;

import clasification.children.Mammalia;

public class Dog extends Mammalia
{
    public Dog(String name)
    {
        super(name);
        super.display();
    }
}