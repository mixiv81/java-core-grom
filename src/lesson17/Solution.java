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
        if (address.contains("http://www.") || address.contains("https://www."))
            return checkAddress(address.substring(address.indexOf('.') + 1, address.lastIndexOf('.')));
        return (address.contains("http://") || address.contains("https://")) && checkAddress(address.substring(address.lastIndexOf('/') + 1, address.lastIndexOf('.')));
    }


    private boolean checkAddress(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }
}
