package lesson17;

public class Solution {

    public boolean validate(String address) {
        return address != null && !address.isEmpty()
                && checkHttpAndSymbol(address)
                && checkDomens(address);
    }

    private boolean checkHttpAndSymbol(String address) {
        return (address.startsWith("http://")
                || address.startsWith("https://")
                || address.startsWith("http://www.")
                || address.startsWith("https://www.")
                && checkAddress(getNameAddress(address)));
    }

    public String getNameAddress(String address) {
        address = address.replace("http://", "");
        address = address.replace("https://", "");
        address = address.replace("www.", "");
        address = address.replace(".com", "");
        address = address.replace(".net", "");
        address = address.replace(".org", "");
        return address;
    }

    private boolean checkDomens(String address) {
        return address.endsWith(".com") || address.endsWith(".net") || address.endsWith(".org");
    }

    private boolean checkAddress(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }
}
