import java.awt.*;
import java.awt.event.*;


public class OneTimePad extends AppletNLO implements ActionListener{
	
	private static final long	serialVersionUID	= 1L;
	
	Label 		msgLB     = new Label("Message");
	TextField 	msgTF     = new TextField();
	
	Label 		keyLB     = new Label("Key");
	TextField	keyTF     = new TextField();
	
	Label		cipherLB  = new Label("Cipher Text: ");
	Button		codeBN    = new Button("Find Cipher Text:");
	
	public void init(){
		add(msgLB, 10, 10, 100, 20);
		add(msgTF, 10, 30, 100, 20, this);
		
		add(keyLB, 10, 60, 100, 20);
		add(keyTF, 10, 80, 100, 20, this);
		
		add(cipherLB, 10, 110, 340, 20);
		add(codeBN, 10, 140, 100, 20, this);
	}
	
	public void actionPerformed(ActionEvent e){
		String cipherTx = encrypt();
		cipherLB.setText("Cipher Text = " + cipherTx);
	}
	
	public String encrypt(){
		String   msg  = (msgTF.getText());
		String   key  = (keyTF.getText());
		
		if (msg.length() != key.length()){
			return ("Error, message and key are not of equal length!");
		} else {
			char[] m = new char[msg.length()];
			char[] k = new char[key.length()];
		
			char[] c = new char[msg.length()];
		
			String s = "";
		
			for (int i = 0; i < msg.length(); i++){
				m[i] = msg.charAt(i);
				k[i] = key.charAt(i);

				c[i] = (char)((m[i] ^ k[i]) + 64);

				s = s + (c[i]);
			}

			return s;
		}
	}
}