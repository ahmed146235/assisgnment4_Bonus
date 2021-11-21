
package assim_4_q1_lab5;

public class TeachingAssistantFactory extends AbstractFactory
{
    public Staff getmemeber(String get_derat)
    {
        String M=get_derat.toLowerCase();
        switch(M)
        {
                case "cs":
                    return new CS_TeachingAssistant();
                case "it":
                    return new IT_TeachingAssistant();
                case "is":
                    return new IS_TeachingAssistant(); 
                default:
                        return null;
        }
        
    }
}
