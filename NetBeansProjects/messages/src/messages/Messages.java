package messages;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Pradeep Negi
 */
public class Messages {

    
    public static void main(String[] args) throws Exception {
try{
   String ACCOUNT_SID = "AC39afe660e1c965f1db26e0baf6ddefe4";
  String AUTH_TOKEN = "e41bbdab9032870b17036741f19d9fc3"; 
  
    Twilio.init(AUTH_TOKEN, AUTH_TOKEN);
 Message m=Message.creator(new PhoneNumber("+919911006216"), new PhoneNumber("+918860404806"),
            "Let's grab lunch at Milliways tomorrow!")
        
        .create();
    System.out.println(m.getSid());
  }catch(NoClassDefFoundError e){
      System.out.println("not send ");
  }}
    
}
