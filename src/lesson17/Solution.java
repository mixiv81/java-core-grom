
package lesson17;

public class Solution {

    public boolean validate(String address) {
        if (!checkAddressNull(address))
            return false;
        if (checkProtocol(address) == null)
            return false;
        if (getNamesWithoutProtocol(address) == null)
            return false;
        if (checkDomens(address) == null)
            return false;
        if (!checkLetterAndDigit(address))
            return false;
        return true;
    }

    private boolean checkAddressNull(String address) {
        return address != null && !address.isEmpty();
    }

    private String checkProtocol(String address) {
        String[] strings = address.toLowerCase().split("://");
        if (strings[0].equals("http") || strings[0].equals("https"))
            return strings[1];
        else
            return null;
    }

    private String[] getNamesWithoutProtocol(String address) {
        String[] names = checkProtocol(address).split("\\.");
        if (names.length == 2)
            return names;
        if (names.length == 3 && names[0].equals("www")) {
            names = new String[]{names[1], names[2]};
        }
        return names;
    }

    private String checkDomens(String address) {
        if (getNamesWithoutProtocol(address)[1].equals("net")
                || getNamesWithoutProtocol(address)[1].equals("com")
                || getNamesWithoutProtocol(address)[1].equals("org")
                && !getNamesWithoutProtocol(address)[0].equals(""))
            return getNamesWithoutProtocol(address)[0];
        return null;
    }

    private boolean checkLetterAndDigit(String address) {
        for (char chars : checkDomens(address).toCharArray()) {
            if (!Character.isLetterOrDigit(chars))
                return false;
        }
        return true;
    }
}
