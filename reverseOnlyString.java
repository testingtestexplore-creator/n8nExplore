package Java;

public class reverseOnlyString {
 
    public static void main(String[] args)
    {
        String input = "today10is20my30interview";

    }

    public static String reverseStringWithSegments(String input)
    {

        StringBuilder result = new StringBuilder();

        String[] parts = input.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)")

        for(String part:parts)
        {
            if(part.matches("[a-zA-Z]+")){
                result.append(new StringBuilder(part).reverse());
            }
            else{
                result.append(part);
            }
        }

        return result.toString();
    }
}
