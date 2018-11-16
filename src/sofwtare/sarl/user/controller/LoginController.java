/**
 * 
 */
package sofwtare.sarl.user.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sofwtare.sarl.user.service.UserService;

/**
 * @author User
 *
 */
public class LoginController implements Initializable {
	
	@FXML
	private javafx.scene.control.TextField username;
	
	@FXML
	private PasswordField password;
	

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	@FXML
	private void loginAction(ActionEvent event) throws Exception {
		String login = username.getText();
		String pass = password.getText();
		if(UserService.seConnecter(login,pass)) {
			JOptionPane.showMessageDialog(null, "ok", "ok", JOptionPane.CLOSED_OPTION);
		}else {
			JOptionPane.showMessageDialog(null, "No", "No", JOptionPane.CLOSED_OPTION);
		}
		
	}
	
	@FXML
	private void closeAction(ActionEvent event) {
		System.exit(0);
	}
	
	@FXML
	private void notYetregisterAction(ActionEvent event) {
		
	}
	
	@FXML
	private void forgotPasswordAction(ActionEvent event) {
		
	}

}
