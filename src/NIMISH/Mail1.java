package NIMISH;
import com.email.durgesh.Email;
public class Mail1 {
      Mail1(int j){
    	  try {
	      	  Email email =new Email("nimishupadhyay00@gmail.com","nimish2001");
	      	  email.setFrom("nimishupadhyay00@gmail.com", "EMERGENCY");
	      	  email.setSubject("Emergency at cc3");
	      	  
	      	  email.setContent("<h1></h1> <p>There is some emergency at cc3 gate no. "+Integer.toString(j)+", please come asap.</p>" , "text/html");
	      	
	      	  email.addRecipient("iit2019113@iiita.ac.in");
	      	  email.send();

	        }
	        catch(Exception e) {
	      	  e.printStackTrace();
	        }
      }
}
