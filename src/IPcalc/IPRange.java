package IPcalc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexey on 11.11.2015.
 */
public class IPRange {
      private static final long m0 = 256*256*256;
      private static final long m1 = 256*256;
      private static final long m2 = 256;

        public long inetAddrToLong( InetAddress ia )
        {
            byte iab[] = ia.getAddress();
            int i0 = iab[0]; if (i0<0) i0+=256;
            int i1 = iab[1]; if (i1<0) i1+=256;
            int i2 = iab[2]; if (i2<0) i2+=256;
            int i3 = iab[3]; if (i3<0) i3+=256;
            return (m0*i0)+(m1*i1)+(m2*i2)+i3;
        }

        public String ipToStr( long ip )
        {
            long a = ip;
            long r0 = a / m0;
            a -= (r0*m0);
            long r1 = a / m1;
            a -= (r1*m1);
            long r2 = a / m2;
            a -= (r2*m2);
            long r3 = a;

            String ips = r0+"."+r1+"."+r2+"."+r3;
            return ips;
        }
    public void getIpRange(byte firstIP[], byte secondIP[]) {
        try {
            InetAddress adr = InetAddress.getByAddress(firstIP);
            InetAddress adr2 = InetAddress.getByAddress(secondIP);
            long ip1 = inetAddrToLong(adr);
            long ip2 = inetAddrToLong(adr2);
            while (ip1 != ip2){
                if (!ipToStr(ip1).contains(".0")) {
                    InetAddress check = InetAddress.getByName(ipToStr(ip1));
                    System. out.println(check.getHostName() + "-> connecting...:" + check.isReachable(1000));
                }
                ip1++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }




}
