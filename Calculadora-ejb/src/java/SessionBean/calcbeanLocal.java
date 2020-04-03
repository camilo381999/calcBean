/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author Camilo
 */
@Local
public interface calcbeanLocal {

    double addition(double b, double a);
    double resta(double b, double a);
    double mult(double b, double a);
    double div(double b, double a);

    
    
}
