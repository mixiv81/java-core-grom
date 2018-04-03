
package lesson17;

public class Solution {

    public boolean validate(String address) {
        return address != null && !address.isEmpty()
                && checkDomens(address)
                && checkAmountProtocol(address)
                && checkStrings(address)
                && checkAmountDomens(address);
    }

    private String[] getProtocol() {
        return new String[]{"http://www.", "https://www.", "http://", "https://"};
    }

    private String[] getDomens() {
        return new String[]{".com", ".org", ".net"};
    }

    private boolean checkProtocol(String address) {
        for (String protocol : getProtocol()) {
            if (address.startsWith(protocol)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkAmountProtocol(String address) {
        if (!checkProtocol(address))
            return false;
        for (String protocol : getProtocol()) {
            if (address.startsWith(protocol)) {
                String[] strings = address.split("://");
                if (strings.length > 2)
                    return false;
            }
        }
        return true;
    }

    private boolean checkDomens(String address) {
        for (String domen : getDomens()) {
            if (address.endsWith(domen)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkAmountDomens(String address) {
        if (!checkDomens(address))
            return false;
        if (!checkAmountProtocol(address))
            return false;
        String[] strings = address.split("\\.");
        String[] domens = {"com", "org", "net"};
        int count = 0;
        for (String string : strings) {
            for (String domen : domens) {
                if (domen.equals("") || string.equals(""))
                    return false;
                if (string.equals(domen))
                    count++;
            }
        }
        return count == 1;
    }

    private boolean checkStrings(String address) {
        String[] protoc = address.split("://");
        String[] strings = protoc[1].split("\\.");
        int count = 0;
        for (String string : strings) {
            if (string.equals("http") || string.equals("https"))
                return false;
            if (!checkAddress(string))
                return false;
        }
        return true;
    }

    private boolean checkAddress(String input) {
        if (input.isEmpty())
            return false;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }
}
