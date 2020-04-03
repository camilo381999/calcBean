package SessionBean;

import javax.ejb.Stateless;
/*@author Camilo*/

@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public double addition(double b, double a) {
        return a+b;
    }
    
    @Override
    public double resta(double b, double a) {
        return a-b;
    }
    
    @Override
    public double mult(double b, double a) {
        return a*b;
    }
    
    @Override
    public double div(double b, double a) {
        return a/b;
    }

    
}
