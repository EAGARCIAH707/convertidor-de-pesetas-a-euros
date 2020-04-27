/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrevs.taller1.controller;

import com.andrevs.taller1.model.ConverterModel;
import com.andrevs.taller1.view.ConverterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author AndresG
 */
public class ConverterController implements ActionListener {

    private final ConverterView converterView;
    private final ConverterModel converterModel;

    public ConverterController(ConverterView converterView) {
        this.converterView = converterView;
        converterModel = new ConverterModel();
    }

    public String converter(String Money) throws Exception {
        Double value = Double.parseDouble(converterView.getValue().getText()
                .trim());
        return converterModel.runConversion(Money, value);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == converterView.getToEuros()) {
                converterView.getMessage().setText(converter("EUR"));
            }
            
            if (e.getSource() == converterView.getToPesetas()) {
                converterView.getMessage().setText(converter("ESP"));
            }
        } catch (Exception ex) {
            converterView.getMessage()
                    .setText("No fue posible realizar la conversion, "
                            + ex.getMessage());
        }

    }
}
