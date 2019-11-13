package fxmaven;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Text textControl;

    public void initialize() throws Exception {
        textControl.setText("Hello Hunter");
    }
}
