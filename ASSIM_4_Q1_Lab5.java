
package assim_4_q1_lab5;

import java.util.Scanner;

public class ASSIM_4_Q1_Lab5 {

    public static void main(String[] args)
    {
        
       Scanner S=new Scanner(System.in);
        System.out.println(" IS The Memeber (Doctor or Teachingassistant)? ");
        String type=S.next();
        System.out.println(" What's the department ?");
        String depa=S.next();
        System.out.println(" What's his name? ");
        String name=S.next();
        System.out.println(" How many years Work ? ");
        int y=S.nextInt();
        System.out.println(" How much is the salary ? ");
        int s=S.nextInt();
        AbstractFactory m=FactoryProducer.getfactory(type);
       // Factory mf=new MemeberFactory();
        Staff mem=m.getmemeber(depa);
        mem.getname(name);
        mem.GetSalary(s);
        mem.getYearsOfWork(y);
        System.out.println("___________________________________\n");
  
    
    
      //AbstractFactory m=FactoryProducer.getfactory("doctor");
      //m.getmemeber(is)

    
    
    
    
    
    }
    
}
