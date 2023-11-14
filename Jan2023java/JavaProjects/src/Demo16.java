class Demo16 {
    // Function to convert String to Byte
    public static byte convertStringToByte(String str)
    {
        // Convert string to byte
        // using valueOf() method
        return Byte.valueOf(str);
    }
    public static void main(String[] args)
    {
        // The string value
        String stringValue = "127";
  
        // Convert string to byte
        byte byteValue = convertStringToByte(stringValue);
  
        // Print the expected byte value
        System.out.println(stringValue+ " String after converting into byte = "+ byteValue);      
            
    }
}