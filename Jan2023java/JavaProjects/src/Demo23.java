class Demo23 {
    // Function to convert String to character
    public static char convertStringToCharacter(String str)
    {

		// Convert string to character
        // using charAt() method
        return str.charAt(2);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "ABC";
        // Convert string to character
        char charValue = convertStringToCharacter(stringValue);
    
        // Print the expected character value
        System.out.println(stringValue+ " String after converting into charecter = "+ charValue);
    }
}