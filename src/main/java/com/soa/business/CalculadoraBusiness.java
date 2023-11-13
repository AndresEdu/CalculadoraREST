/**
 * 
 */
package com.soa.business;

import org.springframework.stereotype.Component;

/*
 * 
 */

@Component
/*
 * @service
 * @Repository*/
public class CalculadoraBusiness {

    /**
     * 
     * @param n1    Operando1
     * @param n2    Operando2
     * @param operacion Operacion a realizar: suma,resta, multiplicacion y division.
     * @return
     */
    
    public double calcular(double n1, double n2, String operacion){
        
        double resultado = 0;
        switch (operacion) {
        case "suma": {
            resultado = n1 + n2;
            break;
        }
        case "resta": {
            resultado =  n1 - n2;
            break;
        }
        case "multiplicacion": {
            resultado = n1 * n2;
            break;
        }
        case "division": {
            if(n2 == 0) {                
                throw new ArithmeticException("División entre 0");
            }
            else {
                resultado = n1/n2;
                break;
            }
        }
        default:
            throw new RuntimeException("No se conoce la operacion \"" + operacion+"\".");
                
        }
        return resultado;   
    }
}
