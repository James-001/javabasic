package com.example.elastic.network;

import org.apache.commons.lang3.StringUtils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * 查看本地ip的方法
 * Created by yto on 2019/2/12.
 */
public class NetWork {

    public static void main(String [] args) throws Exception{


        String str = "\u003ctable style=\u0027width:100%;\u0027\\u003e\u003ctr\u003e\u003ctd\u003e\u003c";
        String str1 = new String(str.getBytes("utf-8"),"utf-8");
        System.out.println(str1);


        String fullAddress = StringUtils.defaultString("中国公有").replace("中国", "");
        System.out.println("111111111--:"+fullAddress);

        Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        InetAddress ip = null;
        while (allNetInterfaces.hasMoreElements())
        {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            System.out.println(netInterface.getName());
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements())
            {
                ip = (InetAddress) addresses.nextElement();
                if (ip != null && ip instanceof Inet4Address)
                {
                    System.out.println("本机的IP = " + ip.getHostAddress());
                }
            }
        }
    }
}
