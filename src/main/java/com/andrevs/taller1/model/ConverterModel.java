/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrevs.taller1.model;

/**
 *
 * @author AndresG
 */
public class ConverterModel {
// Constant values ​​for currencies
    private final Double EUR = 166.386;
    private final Double ESP = 0.006;

    public ConverterModel() {
    }

    public String runConversion(String money, Double value) throws Exception {
        Double result;
        switch (money) {
            case "EUR": {
                result = value * ESP;
                break;
            }
            case "ESP": {
                result = value * EUR;
                break;
            }
            default: {
                throw new Exception("Not valid option");
            }
        }
        return getResponse(result);
    }

    public String getResponse(Double result) {
        return "El resultado es : " + result.toString();
    }
}
