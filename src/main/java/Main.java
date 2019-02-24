import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Foo name1 = new Foo("Java");
        Foo name2 = new Foo("Cobol");

        assertEquals(name1.compareTo(name2),1);

        Foo name3 = name1;

        assertEquals(name1.compareTo(name3),0);

        assertEquals(name2.compareTo(name3),1);
    }
}
