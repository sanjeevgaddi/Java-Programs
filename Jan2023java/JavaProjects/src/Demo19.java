class Demo19 {
    // Function to convert String to long
    public static long convertStringToLong(String str)
    {
        // Convert string to long
        // using valueOf() method
        return Long.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "2147483648";
  
        // Convert string to Long
        long longValue = convertStringToLong(stringValue);
  
        // Print the expected long value
        System.out.println(stringValue + " String after converting into long = " + longValue);
            
           
           
    }
}