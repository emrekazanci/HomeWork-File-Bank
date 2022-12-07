package com.bilgeadam.week05.hwfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {
	File file;

	public static void dosyaYarat(File file) throws Exception {
		if (file.exists()) {
			System.out.println("Dosya zaten var.");
		} else {
			System.out.println("Dosya oluşturuldu.");
			file.createNewFile();
		}
	}

	public static void dosyayaYaz(File file) throws Exception {
		if (file.exists()) {
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Gerisi farklı.");
			bufferedWriter.close();
		}
	}

	public static void dosyaOku(File file) throws Exception {
		if (file.exists()) {
			FileReader fileReader = new FileReader(file);
			String line;
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		}
	}
}
