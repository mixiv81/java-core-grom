package lesson17;

public class Solution {

    public boolean validate(String address) {
        return address != null && !address.isEmpty()
                && checkNameAddress(address)
                && checkDomensAndProtocols(address);
    }

    private boolean checkDomensAndProtocols(String address) {
        return (address.startsWith("http://") || address.startsWith("https://") && address.endsWith(".com") || address.endsWith(".net") || address.endsWith(".org"));
    }

    private boolean checkNameAddress(String address) {
        address = address.replaceAll("http://", "");
        address = address.replaceAll("https://", "");
        address = address.replaceAll("www.", "");
        address = address.replaceAll(".com", "");
        address = address.replaceAll(".net", "");
        address = address.replaceAll(".org", "");
        return checkAddress(address);
    }

    private boolean checkAddress(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }
}
