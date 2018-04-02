package lesson17;

public class Solution {
    public static void main(String[] args) {
        String test = "https://www.gromcod77e.com";
        System.out.println(validate(test));
    }

    public static boolean validate(String address) {
        return address != null && !address.isEmpty() && checkHttp(address) && checkDomen(address);
    }

    private static boolean checkAddress(String input) {
        if (input == null)
            return false;
        if (input.isEmpty())
            return false;
        for (char chars : input.toCharArray()) {
            if (!Character.isLetterOrDigit(chars))
                return false;
        }
        return true;
    }

    private static boolean checkDomen(String address) {
        return address.substring(address.length() - 4).equals(".com") || address.substring(address.length() - 4).equals(".net") || address.substring(address.length() - 4).equals(".com");
    }

    private static boolean checkHttp(String address) {
        return address.substring(0, 7).equals("http://") && checkAddress(address.substring(7, address.length() - 4))
                || address.substring(0, 8).equals("https://") && checkAddress(address.substring(8, address.length() - 4))
                || address.substring(0, 11).equals("http://www.") && checkAddress(address.substring(11, address.length() - 4))
                || address.substring(0, 12).equals("https://www.") && checkAddress(address.substring(12, address.length() - 4));
    }

}

