public class RevertString {
    public void revert(String str) {
        int length = str.length();
        String reversedStr = "";
        for (int i = length - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
    }
    
}
