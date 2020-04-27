/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.andrevs.taller1.controller.ConverterController;
import com.andrevs.taller1.view.ConverterView;

/**
 *
 * @author AndresG
 */
public class TallerApplication {
    
    public static void main(String[] args) {
        ConverterView convererView = new ConverterView();
        ConverterController controller = new ConverterController(convererView);
        convererView.addController(controller);
        convererView.setVisible(true);
        convererView.setLocationRelativeTo(null);
    }
    
}
