package Main;

import java.io.IOException;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.MailSettings;
import com.sendgrid.Method;
import com.sendgrid.Personalization;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.Setting;

public class Example {
  public static void main(String[] args) throws IOException {
	  SendGrid sendGrid = new SendGrid("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");
	  try {
		  Mail mail = new Mail();

		  //差出人
		  Email fromEmail = new Email();
		  fromEmail.setName("Sender");
		  fromEmail.setEmail("r-tochimoto@tcs.co.jp");
		  mail.setFrom(fromEmail);
		  mail.setReplyTo(fromEmail);

		  //件名
		  mail.setSubject("Subject");

		  //本文
		  Content cnt = new Content();
		  cnt.setType("text/html");
		  cnt.setValue("Contents");
		  mail.addContent(cnt);

		  //細かい設定
		  MailSettings mailSettings = new MailSettings();
		  Setting sandBoxMode = new Setting();
		  sandBoxMode.setEnable(true);
		  //mailSettings.setSandboxMode(sandBoxMode);
		  mail.setMailSettings(mailSettings);

		  //宛先
		  Personalization personalization = new Personalization();
		  Email tmp;
		  // To
		  tmp = new Email();
		  tmp.setEmail("r_tochimoto149@yahoo.co.jp");
//		  tmp.setEmail("");
		  personalization.addTo(tmp);
//		  // Cc
//		  tmp = new Email();
////		  tmp.setEmail("r_tochimoto149@yahoo.co.jp");
//		  tmp.setEmail("");
//		  personalization.addCc(tmp);
//		  // Bcc
		  tmp = new Email();
		  tmp.setEmail("ryottt149@gmail.com");
//		  tmp.setEmail("");
		  personalization.addBcc(tmp);
		  mail.addPersonalization(personalization);

		  //送信
		  Request request = new Request();
		  request.setMethod(Method.POST);
		  request.setEndpoint("mail/send");
		  request.setBody(mail.build());
		  Response response = sendGrid.api(request);
		  System.out.println(response.getStatusCode());
		  System.out.println(response.getBody());
		  System.out.println(response.getHeaders());
		} catch (IOException e) {
		  System.err.println(e);
		}
  }
}