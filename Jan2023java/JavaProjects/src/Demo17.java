class Demo17 {
    // Function to convert String to short
    public static short convertStringToShort(String str)
    {
        // Convert string to short
        // using valueOf() method
        return Short.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "32767";
  
        // Convert string to short
        short shortValue = convertStringToShort(stringValue);
  
        // Print the expected short value
        System.out.println(stringValue+ " String after converting into short = " + shortValue);
            
            
           
    }
}