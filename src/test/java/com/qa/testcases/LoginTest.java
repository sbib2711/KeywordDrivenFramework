package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.keyword.engine.KeyWordEngine;

public class LoginTest {
	
public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}

}
