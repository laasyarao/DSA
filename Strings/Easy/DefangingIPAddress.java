package Strings.Easy;

public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        // String str=address.replace(".", "[.]");
        // return str;
        String str[]=address.split("\\.");
        return String.join("[.]", str);
    }
}
