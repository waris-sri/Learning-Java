public class Printf {
    public static void main(String[] args) {
        // for controlling, formatting, and displaying text as specified
        // takes 2 args: format string & obj/var/value
        // format specifier (%) is followed by FLAGS/PRECISION/WIDTH/CONVERSION_CHAR
        System.out.printf("Hello %s", "World");     // prints Hello World
        System.out.printf("\nHello %.3s", "World"); // prints Hello Wor (WIDTH: only get 3 chars)
        System.out.printf("\nHello %3s", "W");      // prints Hello   W (WIDTH: at least 3 chars)
        
        int num = 10;
        double dbl = 9.738926;
        char ch = 'A';
        boolean bool = true;
        double money = 1000000;
        
        System.out.printf("\nBoolean:   %b", bool);     // (CONVERSION CHARACTER)
        System.out.printf("\nInteger:   %d", num);      // (CONVERSION CHARACTER)
        System.out.printf("\nDouble:    %.3f", dbl);    // (PRECISION: round to 3 decimal places)
        System.out.printf("\nCharacter: %c", ch);       // (CONVERSION CHARACTER)
        System.out.printf("\nMoney: %18f", money);      // (FLAGS: setting width to justify text)
        System.out.printf("\nMoney:     %+f", money);   // (FLAGS: putting a +/- sign in front)
        System.out.printf("\nMoney:     %,f", money);   // (FLAGS: sections are separated with commas)
        System.out.printf("\nMoney:     %015f", money); // (FLAGS: zero-pads numbers)
    }
}