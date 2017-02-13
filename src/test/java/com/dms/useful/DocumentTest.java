package com.dms.useful;

import org.junit.Test;

import com.dms.exceptions.ValidateException;
import com.dms.useful.Document;

public class DocumentTest {

	@Test(expected = NullPointerException.class)
	public void deveLancarNullPointException() throws Exception {
		/**
		 * Document não deve receber null como parâmetro em seu construtor.
		 */
		new Document(null) {

			@Override
			protected String validateNumber(String number) throws ValidateException {
				return null;
			}

			@Override
			public String getNumberFormatted() {
				return null;
			}
		};
	}

}