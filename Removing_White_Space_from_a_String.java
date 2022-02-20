public class Removing_White_Space_from_a_String {
    public static void main(String[] args)
    {
        String str = "H e l l o  W o r l d ! !";

        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
