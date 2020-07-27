package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.text.Text;

import java.awt.*;

import java.awt.event.ActionEvent;
//import javafx.scene.control.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ScrollBar ScrollPane;

    @FXML
    private TextField A_side1;

    @FXML
    public TextField A_side2;

    @FXML
    private TextField A_side3;

    @FXML
    private TextField B_side1;

    @FXML
    private TextField B_side2;

    @FXML
    private TextField B_side3;

    @FXML
    private Slider slider;

    @FXML
    private Button count;

    @FXML
    private Text textout;

    @FXML
    void initialize() {

    }

    public void click(javafx.event.ActionEvent actionEvent) {
        System.out.println("Button click");
        TextOutput();
    }

    private char winTeam = 'n';
    private int winYear = 0;

    protected void TextOutput(){
        //условие вывода
        textout.setText("В гражданской войне с указанными параметрами победила сторона " + winTeam + " спустя " + winYear + " лет.");
        textout.setText("В гражданской войне с указанными параметрами никто не победил, война длилась " + winYear + " лет.");
    }
}