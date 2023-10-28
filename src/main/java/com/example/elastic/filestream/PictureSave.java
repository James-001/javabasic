package com.example.elastic.filestream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class PictureSave {

    public static void main(String[] args) {

        try {
            URL url = new URL("http://cdn.otp-express.com/group1/M00/07/C8/CoAj7F2AUlSAY5o-AADEf4difUQ008.png");
            URLConnection con = url.openConnection();
            InputStream comein = con.getInputStream();
            byte[] cache = new byte[1024];
            int len;
            System.out.println(System.getProperty("pom.xml"));
            OutputStream outputStream = new FileOutputStream("d:\\\\image\\\\a.png");

            while ((len = comein.read(cache)) != -1) {
                outputStream.write(cache, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {


        }
    }
}
