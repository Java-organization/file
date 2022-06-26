package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	private static InputStream in ;

	public static void main(String[] args) {

		File file = new File("Desktop:\\test.txt");
		System.out.println(file.canWrite());
		if (!file.exists()) {
			try {
				System.out.println("file yaradilir....");
				file.createNewFile();
				System.out.println("file yaradildi");
			} catch (IOException e) {
				System.out.println("yarada bilmedi");
				e.printStackTrace();
			}
		}

		// muelumatlarin yazilma meselesi.

		try (OutputStream out = new FileOutputStream(file)) {
			System.out.println("muelumatlar yazilir");
			out.write("Amerika".getBytes());
			out.write("\nİspanya".getBytes());
			out.write("\nÇin".getBytes());
			out.write("\nİtalya".getBytes());
			out.write("\nMeksika ".getBytes());
			out.write("\nİngiltere".getBytes());
			out.write("\nAlmanya".getBytes());
			out.write("\nTurkiye".getBytes());
			out.write("\nFransa ".getBytes());
			out.write("\nRusia".getBytes());
			System.out.println("muelumatlar yazildi");
		} catch (IOException ex) {

			ex.printStackTrace();
		}
		// muelumatlarin oxunmasi
		try {
			 in = new FileInputStream(file);
				for (int i = 0; i < 79; i++) {
					char ch = (char) in.read();
					System.out.print(ch);
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
