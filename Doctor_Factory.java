
package assim_4_q1_lab5;

public class Doctor_Factory extends AbstractFactory
{
    public Staff getmemeber(String get_derat)
    {
        String M=get_derat.toLowerCase();
        switch(M)
        {
                case "cs":
                    return new CS_Doctor();
                case "it":
                    return new IT_Doctor();
                case "is":
                    return new IS_Doctor(); 
                default:
                        return null;
        }
        
    }
}
