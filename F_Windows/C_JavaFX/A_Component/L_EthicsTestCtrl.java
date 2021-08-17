package A_Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;

public class L_EthicsTestCtrl {
	@FXML
	RadioButton choice1, choice2, choice3, choice4;
	
	String Title, Message;
	public void submit(ActionEvent event) {
		
		Alert alert = new Alert(AlertType.INFORMATION);

		if(choice1.isSelected()) {
			alert.setHeaderText("되.판.다.");
			alert.setContentText("...");
			alert.setTitle("1번");
		}else if(choice2.isSelected()) {
			alert.setTitle("2번");
			alert.setHeaderText("알.린.다.");
			alert.setContentText("용기있는 행동이군요.");
		}else if(choice3.isSelected()) {
			alert.setTitle("3번");
			alert.setHeaderText("따.진.다.");
			alert.setContentText("당신에게 행운이 있기를...");
		}else if(choice4.isSelected()) {
			alert.setTitle("4번");
			alert.setHeaderText("죽.인.다.");
			alert.setContentText("큰일나요. 진정하시지요.");
		}else{
			alert.setTitle("낫씽");
			alert.setHeaderText("몰.라.요.");
			alert.setContentText("확실히 아닌것은 있지만, 정답은 없어요~");
		}
		alert.show();
	}
}
