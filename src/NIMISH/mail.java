package NIMISH;

import java.util.Date;

import com.email.durgesh.Email;


public class mail {

	mail(String s, String s1){
		Date date = new Date();
	  	  try {
	      	  Email email =new Email("nimishupadhyay00@gmail.com","nimish2001");
	      	  email.setFrom("nimishupadhyay00@gmail.com", "FEEDBACK");
	      	  email.setSubject("feedback on automatic door system by "+s);
	      	  
	      	  email.setContent("<h1></h1> <p> "+s1+ " </p>" , "text/html");
	      	
	      	  email.addRecipient("iit2019113@iiita.ac.in");
	      	  email.send();

	        }
	        catch(Exception e) {
	      	  e.printStackTrace();
	        }
	}
}
