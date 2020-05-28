package com.learning.creational.factory;

import java.io.File;

public class FactoryMain {

	public static void main(String[] args) {

		File file = new File("D:\\Personal\\Monthly.csv");
		FileProcessor fileProcessor = FileProcessorFactory.getFileProcessor(file);
		if(fileProcessor.validateFile(file)) {
			fileProcessor.fileProcess(file);
		}
		
	}

}
