public class Reverse
{
    public static void main(String args[])
    {
        String sampleString = "My name is Merengo";
        String reversed = "";

        for(int i = sampleString.length()-1;i>=0;i--)
        {
            reversed = reversed + sampleString.charAt(i);
        }

        System.out.println("The reversed string is " + reversed);
    }
}