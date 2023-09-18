package com.nestedclass;

import java.util.regex.Pattern;

public class EmailValidator {

	public static String emailregex="(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})";
	

	public static void validate(String originalEmail) {
		class EmailFormatter{
		
			private String formattedMailId;
			
			public EmailFormatter(String emailId) {
				
				this.formattedMailId=emailId;
			}
				
				public boolean checkEmailFormat() {
					if(Pattern.compile(emailregex).matcher(this.formattedMailId).matches()) {
						return true;
					}else {
						return false;
					}
				}
			}
		EmailFormatter email = new EmailFormatter(originalEmail);
		boolean result = email.checkEmailFormat();
		
		if(result) {
			System.out.println("Email is Valid");
		}else {
			System.out.println("Email is NotValid");
		}
		}
	}
