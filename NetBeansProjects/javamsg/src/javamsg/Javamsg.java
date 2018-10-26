package javamsg;
import com.teknikindustries.bulksms.SMS;
public class Javamsg {

    public static void main(String[] args) {

    SMS sms=new SMS();
    sms.SendSMS("iampradeep","9911006216", "hey there message from java program", "9911006216", "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
    
    }
    
}
