package com.qa.TestLayer;

import com.qa.TestBase.TestBase;

public class Testclass extends TestBase {

	@org.testng.annotations.Test
	public void Test()
	{
		t.contact();
		t.subject();
		t.email();
		t.selectFile();
		t.massage();
		t.send();
	}
}
