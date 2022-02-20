public class Counting_duplicate_Characters {
    public static class DupleStr {
        public static void main(String [] args) {

            String str = "NyaHallo Warudo";
            int cnt = 0;
            char[] inp = str.toCharArray();
            System.out.println("The Duplicate Characters are:");
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (inp[i] == inp[j]) {
                        System.out.println(inp[j]);
                        cnt++;
                        break;
                    }
                }
            }
        }
    }
}
