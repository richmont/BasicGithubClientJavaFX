package br.com.richmont;

import br.com.richmont.controllers.UsernameForm;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import java.io.IOException;

public class MainApp extends Application {
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    public void start(Stage mainStage) throws IOException {
        UsernameForm uf = new UsernameForm();
        Parent parent = uf.loadFxml();
        GridPane root = new GridPane();
        Scene scene = new Scene(parent);
        mainStage.setScene(scene);
        mainStage.show();
        }


        //Application.launch(UsernameForm.class, args);
        /*
        String username = "torvalds";
        GithubApiGetUser gu = new GithubApiGetUser(username);
        try{
            gu.doRequest();
        } catch (WrongUrlException | IOException | NotFound e) {
            throw new RuntimeException(e);
        }
        GithubUserDeserializer gud = new GithubUserDeserializer(gu);
        try {
            gud.deserialize();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        GithubUser user = gud.getUser();
        GithubApiGetRepository gr = new GithubApiGetRepository(user);
        try{
            gr.doRequest();
        } catch (WrongUrlException | IOException | NotFound e) {
            throw new RuntimeException(e);
        }
        GithubRepositoryDeserializer grd = new GithubRepositoryDeserializer(gr);
        try {
            grd.deserialize();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        List<GithubRepository> repos = grd.getRepositoryList();
        System.out.println(user);
        System.out.println(repos);
*/
    }
