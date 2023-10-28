package com.example.elastic.filestream;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://cdn.otp-express.com/group1/M00/07/C8/CoAj7F2AUlSAY5o-AADEf4difUQ008.png");
			InputStream in = url.openStream();
			BufferedInputStream buffer = new BufferedInputStream(in);
			StringBuffer stringBuffer = new StringBuffer("");
			int len = 0;
			byte[] bytes = new byte[1024];
			while ((len = buffer.read(bytes)) != -1) {
				stringBuffer.append(new String(bytes, 0, len));
			}
			stringBuffer.toString();
			System.out.println(stringBuffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
