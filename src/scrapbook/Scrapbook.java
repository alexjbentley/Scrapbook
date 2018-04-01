package scrapbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Scrapbook extends Application {

    private HBox createToolbar() {
        HBox toolbar = new HBox();
        toolbar.setPadding(new Insets(15, 12, 15, 12)); // Probably change these values
        toolbar.setSpacing(10); // Probably change this value
        toolbar.setStyle("-fx-background-color: '#222211'");
        toolbar.setAlignment(Pos.CENTER);

        Button view = new Button("View");
        view.setPrefSize(100, 20); // Probably change this to scale

        Button create = new Button("Create");
        create.setPrefSize(100, 20);

        toolbar.getChildren().addAll(view, create);

        return toolbar;
    }

    /*
     * This needs to be changed so that it loads from the user's timeline data.
     */
    private VBox createSideBar() {
        VBox sidebar = new VBox();

        sidebar.setPadding(new Insets(10)); // Probably change this value
        sidebar.setSpacing(8); // Probably change this value
        sidebar.setStyle("-fx-background-color: '#222211'");

        TitledPane timelineParent = new TitledPane("Timeline", new Button("TestButton"));
        // Need to replace this with a call to auto-generate from user data.

        sidebar.getChildren().addAll(timelineParent);

        return sidebar;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        HBox toolbar = createToolbar();
        borderPane.setTop(toolbar);

        VBox sidebar = createSideBar();
        borderPane.setRight(sidebar);

        ScrollPane scroller = new ScrollPane(); // Needs to be made more interesting
        borderPane.setCenter(scroller);

        primaryStage.setTitle("Scrapbook");
        primaryStage.setScene(new Scene(borderPane, 500, 500));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
