public class Main {
    public static void main(String[] args) {
        String msg = "nick_name:”Jason”," +
                     "age:24," +
                     "job:”Student”," +
                     "height:179.4," +
                     "weight:75.8";

        Person Jason = new Person(msg);

        // Person.PrintAll()
        Jason.PrintAll();

        // Person.PrintKey()
        Jason.PrintKey();

        // Person.PrintValue
        Jason.PrintValue();

        // Person.ValueOfKey(String key)
        System.out.println(Jason.ValueOfKey("nick_name"));
    }
}
