package lesson17;

public class Solution {

    public boolean validate(String address) {
        return address != null && !address.isEmpty()
                && checkDomes(address)
                && checkHttpAndSymbol(address);
    }

    private boolean checkAddress(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }

    private boolean checkDomes(String address) {
        return (address.substring(address.length() - 4).equals(".com")
                || address.substring(address.length() - 4).equals(".org")
                || address.substring(address.length() - 4).equals(".net"));
    }

    private boolean checkHttpAndSymbol(String address) {
        return (address.substring(0, 7).equals("http://") && checkAddress(address.substring(7, address.length() - 4))
                || address.substring(0, 8).equals("https://") && checkAddress(address.substring(8, address.length() - 4))
                || address.substring(0, 11).equals("http://www.") && checkAddress(address.substring(11, address.length() - 4))
                || address.substring(0, 12).equals("https://www.") && checkAddress(address.substring(12, address.length() - 4)));
    }
}
