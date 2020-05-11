package com.learning.factory;

import java.io.File;

public class FileProcessorFactory {
	private static final String PERIOD = ".";
	private static final String CSV = "csv";
	private static final String PDF = "pdf";

	 public static FileProcessor getFileProcessor(File file) {
		String fileExtn = getFileExtension(file);
		if (fileExtn.equalsIgnoreCase(CSV)) {
			return new CSVFileProcessor();
		} else if (fileExtn.equalsIgnoreCase(PDF)) {
			return new PDFFileProcessor();
		} else {
			throw new UnsupportedOperationException();
		}

	}

	private static String getFileExtension(File file) {
		String fileType = "";
		if (file.getName().lastIndexOf(PERIOD) != -1 && file.getName().lastIndexOf(PERIOD) != 0)
			fileType = file.getName().substring(file.getName().lastIndexOf(PERIOD) + 1);
		return fileType;
	}

}
