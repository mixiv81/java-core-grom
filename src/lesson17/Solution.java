
package lesson17;

public class Solution {

    public boolean validate(String address) {
        return address != null && !address.isEmpty() && checkDomensAndProtocols(address);
    }


    private boolean checkDomensAndProtocols(String address) {
        if (address == null || address.isEmpty())
            return false;
        String[] strings = address.split("://");
        if(strings.length < 2)
            return false;
        if (!strings[0].equals("http") && !strings[0].equals("https"))
            return false;
        if (strings[1].equals("http") || strings[1].equals("https"))
            return false;

        String[] namesAddress = strings[1].split("\\.");
        if (namesAddress.length > 3)
            return false;

        if (namesAddress.length == 3) {
            if (namesAddress[0].equals("www") && namesAddress[2].equals("net") || namesAddress[2].equals("com") || namesAddress[2].equals("org")) {
                    return checkAddress(namesAddress[1]);
                }
            }


        if (namesAddress.length == 2) {
            if (namesAddress[1].equals("net") || namesAddress[1].equals("com") || namesAddress[1].equals("org")) {
                    return checkAddress(namesAddress[0]);
                }
            }
        return false;
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
