package project;

import com.sun.mail.smtp.SMTPTransport;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Void
 */


public class EsqueceuSenha {

    public static void Send(final String usuario, final String senha, String email, String titulo, String mensagem) throws AddressException, MessagingException {
        EsqueceuSenha.Send(usuario, senha, email, "", titulo, mensagem);
    }

    public static void Send(final String usuario, final String senha, String email, String ccemail, String titulo, String mensagem) throws AddressException, MessagingException {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

        // Get a Properties object
        Properties props = System.getProperties();
        props.setProperty("mail.smtps.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtps.auth", "true");

        props.put("mail.smtps.quitwait", "false");

        Session session = Session.getInstance(props, null);

        // -- Create a new message --
        final MimeMessage msg = new MimeMessage(session);

        // -- Set the FROM and TO fields --
        msg.setFrom(new InternetAddress(usuario + "@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email, false));

        if (ccemail.length() > 0) {
            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccemail, false));
        }

        msg.setSubject(titulo);
        msg.setText(mensagem, "utf-8");
        msg.setSentDate(new Date());

        SMTPTransport t = (SMTPTransport)session.getTransport("smtps");

        t.connect("smtp.gmail.com", usuario, senha);
        t.sendMessage(msg, msg.getAllRecipients());      
        t.close();
    }
}