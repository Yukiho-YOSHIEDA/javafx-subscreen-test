import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    Stage stage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void showSubScreen() throws IOException {
        Stage newStage = new Stage();
        // モーダルウインドウに設定
        newStage.initModality(Modality.APPLICATION_MODAL);
        // オーナーを設定
        newStage.initOwner(stage);

        FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("sub.fxml"));
        Parent root = fxmlLoader.load();

        newStage.setScene(new Scene(root));

        newStage.show();

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
