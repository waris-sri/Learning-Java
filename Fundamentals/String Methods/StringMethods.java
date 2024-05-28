public class StringMethods {
    public static void main(String[] args) {
        String str = "          \"Hello World!\"          ";
        int length = str.length();
        char firstChar = str.trim().charAt(0);
        boolean isEmpty = str.isEmpty();
        String trimmedStr = str.trim();
        int lengthTrimmed = str.trim().length();
        String upperCaseString = str.trim().toUpperCase();
        String lowerCaseString = str.trim().toLowerCase();
        int index = str.trim().indexOf("l");
        String selectedFromIndex1To4 = str.trim().substring(1, 4);
        String selectedSinceIndex8 = str.trim().substring(8);

        String extender = " is a classic text output in beginner programming courses.";
        String longerHelloWorld = trimmedStr.concat(extender);

        String A = "ABCD";
        String B = "ABCXYZ"; // will compare at the 1st different letter ONLY (between D & X)
        int compareAB = A.compareTo(B); // prints out -20 from 68 - 88 (ASCII values)
        // … and many more!
        System.out.println(
                length + "\n" +
                        lengthTrimmed + "\n" +
                        firstChar + "\n" +
                        isEmpty + "\n" +
                        trimmedStr + "\n" +
                        upperCaseString + "\n" +
                        lowerCaseString + "\n" +
                        index + "\n" +
                        selectedFromIndex1To4 + "\n" +
                        selectedSinceIndex8 + "\n" +
                        longerHelloWorld + "\n" +
                        compareAB);
    }
}