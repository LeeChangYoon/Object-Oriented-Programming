import java.util.Scanner;

public class Person {
    String[] key;
    String[] value;

    // Constructor
    public Person(String msg) {
        String[] temp = msg.split(",");
        this.key = new String[temp.length];
        this.value = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            String[] cache = temp[i].split(":");
            this.key[i] = cache[0];
            this.value[i] = cache[1].replaceAll("”", "");
        }
    }

    // Prints all keys and corresponding values
    public void PrintAll() {
        for (int i = 0; i < this.key.length; i++)
            System.out.println("Key: " + this.key[i] + ", " + "value: " + this.value[i]);
    }

    // Prints all keys
    public void PrintKey() {
        for (String key : this.key)
            System.out.println("Key: " + key);
    }

    // Prints all values
    public void PrintValue() {
        for (String value : this.value)
            System.out.println("Value: " + value);
    }

    // Prints value of corresponding key
    public String ValueOfKey(String key) {for (int i = 0; i < this.key.length; i++)
            if (key.equals(this.key[i]))
                return this.value[i];
        return "Value not found";
    }
}

