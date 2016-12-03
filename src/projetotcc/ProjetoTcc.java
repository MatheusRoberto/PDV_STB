/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotcc;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author bieuu
 */
public class ProjetoTcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * @autor SID
         * Adicionando o código de invocação do tema
         * Invocação direta da tela inicial
         */
        try{
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
            e.printStackTrace();
         }    
        
        JFrame janela = new Tela_Inicial1();
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        
    }
    
}
