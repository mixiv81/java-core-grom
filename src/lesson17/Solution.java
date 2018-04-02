package lesson17;

public class Solution {

    public boolean validate(String address) {
        return address != null && !address.isEmpty()
                && checkDomensAndProtocols(address)
                && checkNameAddress(address);

    }

    private boolean checkDomensAndProtocols(String address) {
        if (!address.startsWith("http://") && !address.startsWith("https://"))
            return false;
        if (!address.endsWith(".com") && !address.endsWith(".net") && !address.endsWith(".org"))
        return false;
        else
            return true;
    }

    private boolean checkNameAddress(String address) {
        address = address.replaceAll("http://", "");
        address = address.replaceAll("https://", "");
        address = address.replaceAll("www.", "");
        address = address.replaceAll(".com", "");
        address = address.replaceAll(".net", "");
        address = address.replaceAll(".org", "");
        return address != null && !address.isEmpty() && checkAddress(address);
    }

    private boolean checkAddress(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }
}
