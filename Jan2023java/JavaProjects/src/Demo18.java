class Demo18 {
    // Function to convert String to integer
    public static int convertStringToInt(String str)
    {
        // Convert string to integer
        // using valueOf() method
        return Integer.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "2147483647";
  
        // Convert string to integer
        int intValue = convertStringToInt(stringValue);
  
        // Print the expected integer value
        System.out.println(stringValue + " String after converting into integer = " + intValue);
            
           
           
    }
}