package IPcalc;

/**
 * Created by Alexey on 11.11.2015.
 */
public class Ipv4Test {
    public static void main(String[] args){
        byte ip[] ={(byte) 185, (byte) 68, (byte) 16, (byte) 64};
        byte ip2[] ={(byte) 185, (byte) 68, (byte) 24, (byte) 90};
        IPRange ipRange = new IPRange();
        ipRange.getIpRange(ip,ip2);


    }

}
