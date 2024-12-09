
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
public class Main extends Application{
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("YourChem");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void Main(String[] args) { launch(args); }
}
