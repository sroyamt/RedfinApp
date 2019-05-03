package com.qa.redfinapp.managers;

import com.qa.redfinapp.dataProviders.ConfigFileReader;

public class FileReaderManager {
	
	private static FileReaderManager fileRdrMgr = new FileReaderManager();
	private static ConfigFileReader configFileRdr;
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		return fileRdrMgr;
	}
	
	public ConfigFileReader getConfigFileRdr() {
		return (configFileRdr == null) ? new ConfigFileReader() : configFileRdr;
	}
	
}
