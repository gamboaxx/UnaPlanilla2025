package cr.ac.una.unaplanilla2025.controller;

import cr.ac.una.unaplanilla2025.util.AppContext;
import cr.ac.una.unaplanilla2025.util.FlowController;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LogInController implements Initializable{

    @FXML
    private AnchorPane root;
    @FXML
    private ImageView imgFondo;
    @FXML
    private MFXTextField txfUsuario;
    @FXML
    private MFXPasswordField txfClave;
    @FXML
    private MFXButton btnCancelar;
    @FXML
    private MFXButton btnIngresar;


    
    @FXML
    private void onActionBtnCancelar(ActionEvent event) {
        ((Stage)btnCancelar.getScene().getWindow()).close();

    }

    @FXML
    private void onActionBtnIngresar(ActionEvent event) {
        FlowController.getInstance().goMain();
       
    }
        
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imgFondo.fitHeightProperty().bind(root.heightProperty());
        imgFondo.fitWidthProperty().bind(root.widthProperty());
        
        
    }
}
