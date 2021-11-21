
package assim_4_q1_lab5;

public class FactoryProducer 
{
    public static AbstractFactory getfactory(String factory )
    {
        if(factory.equalsIgnoreCase("doctor"))
        {
            return new Doctor_Factory();
        }
        else if (factory.equalsIgnoreCase("teachingassistant"))
        {
           return new TeachingAssistantFactory();
        }
        return  null;
    }
}
