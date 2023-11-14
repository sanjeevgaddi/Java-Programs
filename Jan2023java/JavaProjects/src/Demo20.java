class Demo20 {
    // Function to convert String to float
    public static float convertStringToFloat(String str)
    {
        // Convert string to float
        // using valueOf() method
        return Float.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "22";
  
        // Convert string to float
        float floatValue = convertStringToFloat(stringValue);
  
        // Print the expected float value
        System.out.println(stringValue + " String after converting into float = "+ floatValue);
    }
}