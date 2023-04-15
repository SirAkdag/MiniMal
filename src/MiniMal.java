import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MiniMal extends Application {
    @Override
    public void start(Stage meineStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sb_minimal.fxml"));
        Scene meineScene = new Scene(root,800,600);
        meineStage.setTitle("Minimal");
        meineStage.setScene(meineScene);
        meineStage.setResizable(false);
        meineStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}