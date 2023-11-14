class Demo21 {
    // Function to convert String to double
    public static double convertStringToDouble(String str)
    {
        // Convert string to double
        // using valueOf() method
        return Double.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "22";
  
        // Convert string to double
        double doubleValue = convertStringToDouble(stringValue);
  
        // Print the expected double value
        System.out.println(stringValue+ " String after converting into double = "+ doubleValue);
    }
}