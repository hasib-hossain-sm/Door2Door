/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package door2door;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AdminPanelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXButton nevbtn_users,nevbtn_deliveryman,nevbtn_parcels,nevbtn_customeranalysis,nevbtn_complainbox;
    @FXML
    private AnchorPane anchorpane_users,anchorpane_deliveryman,anchorpane_parcels,anchorpane_customeranalysis,anchorpane_complainbox;
    
    @FXML
    private void nevbtn_users_pressed(ActionEvent event) {
        anchorpane_users.toFront();
    }
    @FXML
    private void nevbtn_deliveryman_pressed(ActionEvent event) {
        anchorpane_deliveryman.toFront();
    }
    
    @FXML
    private void nevbtn_parcels_pressed(ActionEvent event) {
        anchorpane_parcels.toFront();
    }
    @FXML
    private void nevbtn_customeranalysis_pressed(ActionEvent event) {
        anchorpane_customeranalysis.toFront();
    }    
    @FXML
    private void nevbtn_complainbox_pressed(ActionEvent event) {
        anchorpane_complainbox.toFront();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
