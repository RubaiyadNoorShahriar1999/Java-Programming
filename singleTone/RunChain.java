class Chaining {

    public String name = "My Default value";

    public Chaining setName( String name ) {
        this.name = name;

        return this;
    }

    public Chaining display() {

        System.out.println( this.name );

        return this;
    }
}


public class RunChain {

    public static void main( String[] args ) {
        Chaining obj1 = new Chaining();
        Chaining obj2 = new Chaining();
        Chaining obj3 = new Chaining();
        Chaining obj4 = new Chaining();

        obj1.display().setName("Rubaiyad").display();
        obj2.display().setName("Nobir").display();
        obj3.display().setName("Niloy").display();
        obj4.display().setName("Akash vora tara").display();
    }
}