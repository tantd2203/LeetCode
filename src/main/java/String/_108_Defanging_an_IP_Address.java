package String;

public class _108_Defanging_an_IP_Address {

    public String defangIPaddr(String address) {

        address = address.replace(".", "[.]");

        return address;

    }

}
