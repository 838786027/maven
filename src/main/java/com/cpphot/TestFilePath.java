package com.cpphot;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class TestFilePath {
	public static void main(String[] args) throws IOException {
		System.out.println(TestFilePath.class.getClassLoader().getResource("").getPath());
		System.out.println(TestFilePath.class.getClassLoader().getResource("test.txt").getPath());
		InputStream is=TestFilePath.class.getClassLoader().getResourceAsStream("test.txt");
		byte[] bs=new byte[1024];
		is.read(bs);
		System.out.println(new String(bs));
		System.out.println(new File(TestFilePath.class.getClassLoader().getResource("test.txt").getPath()).exists());
		System.out.println(new File(".").getCanonicalPath());
		System.out.println(new File("").getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
	}
}
