
package assim_4_q1_lab5;

public class IT_TeachingAssistant implements Staff
{
    public IT_TeachingAssistant ()
    {
        System.out.println(" He is a Teaching Assistant in IT Department");
    }
    public void getname(String name)
    {
        System.out.println(" The Assistant : "+name);
    }
 public void GetSalary(int S)
 {
    System.out.println(" The salary is "+S+" P.E"); 
 }
 public void getYearsOfWork(int Y)
 {
   System.out.println(" The work's Years is "+Y+" years");
 }
}
