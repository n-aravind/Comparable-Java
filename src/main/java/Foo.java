public class Foo implements Comparable{
    private final String name;

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        return 1;
    }
}
