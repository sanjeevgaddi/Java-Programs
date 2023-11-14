class Demo22 {
    // Function to convert String to boolean
    public static boolean convertStringToBoolean(String str)
    {
        // Convert string to boolean
        // using valueOf() method
        return Boolean.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "True";
  
        // Convert string to boolean
        boolean booleanValue = convertStringToBoolean(stringValue);

        // Print the expected boolean value
        System.out.println(stringValue + " String after converting into boolean = "+ booleanValue);
    }
}