/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class LivrosController implements Initializable {

    @FXML
    private MenuItem btnHistoria;
    @FXML
    private MenuItem btnHabilidades;
    @FXML
    private MenuItem btnItens;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirLdj(MouseEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("http://dnd5ed.github.io/livros/LDJ.pdf").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void abrirGM(MouseEvent event) {
     try {
            Desktop.getDesktop().browse(new URL("http://dnd5ed.github.io/livros/GM.pdf").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void abrirMM(MouseEvent event) {
    try {
            Desktop.getDesktop().browse(new URL("http://dnd5ed.github.io/livros/MM.pdf").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(LivrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
