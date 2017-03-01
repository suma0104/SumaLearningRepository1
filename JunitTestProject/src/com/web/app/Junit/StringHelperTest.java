package com.web.app.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.web.app.StringHelper;

public class StringHelperTest {

	@Test
	public void testReplaceString() {

		StringHelper helper=new StringHelper();
		String actualOp=helper.replaceString("ABCD");
		String expectedOp=".BCD";
		assertEquals(expectedOp, actualOp);
	}

}
