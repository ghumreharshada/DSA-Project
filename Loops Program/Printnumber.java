

public class Printnumber {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {  // ✅ No semicolon
            System.out.println(counter);
            counter++;  // ✅ Increment inside the loop
        }
    }
}

