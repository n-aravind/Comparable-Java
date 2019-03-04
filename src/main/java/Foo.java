
public class Foo implements Comparable<Foo> {
    private final String name;

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public int compareTo(Object o) {
//
//        if (o == null || !(o instanceof Foo)) {
//            throw new IllegalArgumentException("cannot compare");
//        }
//
//        Foo other = (Foo)o;
//
//        if (this == other){
//            return 0;
//        }
//
//        return this.name.compareTo(other.name);
//    }

    public int compareTo(Foo o) {

        if (o == null) {
            throw new IllegalArgumentException("cannot compare");
        }

        if (this == o){
            return 0;
        }

        return this.name.compareTo(o.name);
    }



}
