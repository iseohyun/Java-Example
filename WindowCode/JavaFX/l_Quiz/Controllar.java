package l_Quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;

public class Controllar {
    @FXML
    RadioButton choice1, choice2, choice3, choice4;

    String Title, Message;

    public void submit(ActionEvent event) {

        Alert alert = new Alert(AlertType.INFORMATION);

        // 정답지
        if (choice1.isSelected()) {
            // 지문: 다형성에 의해 부모 객체 타입에 자식 객체를 대입 할 수 있다.
            alert.setTitle("1번");
            alert.setHeaderText("올바른 문장입니다.");
            alert.setContentText("최소의 조건만 맞는다면 얼마든지 다른 객체를 사용할 수 있습니다.");
        } else if (choice2.isSelected()) {
            // 지문: 자식 객체는 언제나 부모 객체보다 크다.
            alert.setTitle("2번");
            alert.setHeaderText("올바른 문장입니다.");
            alert.setContentText("자식 객체는 부모객체의 모든 기능을 상속받기 때문입니다.");
        } else if (choice3.isSelected()) {
            // 지문: 클래스는 변수와 상수로 구성되어 있다.
            alert.setTitle("3번");
            alert.setHeaderText("틀린 문장입니다.(상수→함수)");
            alert.setContentText("클래스는 변수와 함수로 이루어져 있습니다.");
        } else if (choice4.isSelected()) {
            // 지문: 상속을 통해서 복잡한 객체를 좀 더 체계적으로 표현 할 수 있다.
            alert.setTitle("4번");
            alert.setHeaderText("올바른 문장입니다.");
            alert.setContentText("단순한 객체를 상속받아 더 구체적인 객체를 구현 할 수 있습니다.");
        } else {
            alert.setTitle("선택을 하지 않았습니다.");
            alert.setHeaderText("재도전 해보세요.");
            alert.setContentText("정답이 당신을 쳐다보고 있습니다.");
        }
        alert.show();
    }
}