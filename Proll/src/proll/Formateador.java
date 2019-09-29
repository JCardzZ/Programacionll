
package proll;


public class Formateador {
    public double convertDecimal(String pString){
        String retorno = new String();
        int tamañoString = pString.length();
        for (int i = 0; i < tamañoString; i++) {
            if (pString.charAt(i)== ',') {
                retorno += '.';
                
            }else{
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
        
    }
}
