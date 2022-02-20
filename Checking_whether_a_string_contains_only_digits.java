public class Checking_whether_a_string_contains_only_digits {
    public static class Demo {
        public static void main(String []args) {
            String str = "4434";
            if(str.matches("[0-9]+")) {
                System.out.println("String contains only digits!");
            }
        }
    }
}
