package com.learning.creational.factory;

import java.io.File;

public interface FileProcessor {

	void fileProcess(File file);

	default Boolean validateFile(File file) {

		if (file == null) {
			return Boolean.FALSE;
		}

		return Boolean.TRUE;

	}
}
