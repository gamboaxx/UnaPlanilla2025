/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.unaplanilla2025.controller;

import cr.ac.una.unaplanilla2025.util.FlowController;
import io.github.palexdev.materialfx.controls.MFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author josue_5njzopn
 */
public class PrincipalController extends Controller implements Initializable {

    @FXML
    private MFXButton btnEmpleados;
    @FXML
    private MFXButton btnTipoPlanilla;
    @FXML
    private MFXButton btnCerrarSesion;
    @FXML
    private MFXButton btnSalir;
    @FXML
    private BorderPane root;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnEmpleados(ActionEvent event) {
        FlowController.getInstance().goView("EmpleadosView");
    }

    @FXML
    private void onActionBtnTipoPlanilla(ActionEvent event) {
         FlowController.getInstance().goView("TiposPlanillaView");
    }

    @FXML
    private void onActionBtnCerrarSesion(ActionEvent event) {
    }

    @FXML
    private void onActionBtnSalir(ActionEvent event) {
        FlowController.getInstance().salir();
    }

   
    
}
