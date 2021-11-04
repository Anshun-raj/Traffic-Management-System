                                               // Traffic Management System//
import java.util.*;
public class Traffic
{
    public static void main(String[] args)
    {
      Light obj=new Light();
      Fine obj1=new Fine();
      Scanner sc=new Scanner(System.in);
      while(true)
      {
          System.out.println("Press 1. for Traffic System");
          System.out.println("Press 2. for Fine Charged");
          System.out.print("Enter your choice:");
          int choice=sc.nextInt();
          if(choice==1)
          {
              System.out.println("Enter the maximum no. of vehicles to be enter in a particular road:");
              int maxLim = sc.nextInt();
              System.out.println("Enter the actual no. of vehicle entered:");
              int actVeh = sc.nextInt();
              if (actVeh >= maxLim)
              {
                  System.out.println("Limit Exceeded");
                  obj.activateSensor();
                  obj.highTraffic();
              }
              else if (actVeh <= maxLim && actVeh >= 10)
              {
                  System.out.println("Kick start your vehicles");
                  obj.lowTraffic();
              }
              else if (actVeh < 10)
              {
                  System.out.println("Lets go");
                  obj.deactivateSensor();
                  obj.NoTraffic();
              }
          }
          else if(choice==2)
          {
              System.out.println("Enter the barricade limit:");
              int cadeLim=sc.nextInt();
              System.out.println("Enter the distance that a particular vehicle user crosses the barricade limit:");
              int vehLim=sc.nextInt();
              if(vehLim>=cadeLim)
              {
                  obj1.fineCharge();
                 System.out.println("Enter the aadhar no. of a person to whom fine is charges");
                 long aadhar=sc.nextInt();
              }
              else
              {
                  System.out.println("No fine is charges against anyone");
              }
          }
          else
          {
              System.out.println("Wrong choice");
          }
      }
    }
}
class Fine
{
    public void fineCharge()
    {
        System.out.println("fine of 100 rupees is charge against you because you crosses the barricade limit");
    }
}
class Sensor
{
    public void activateSensor()
    {
        System.out.println("Sensor get activated");
    }
    public void almostOffSensor()
    {
        System.out.println("Sensor is about to OFF");
    }
    public void deactivateSensor()
    {
        System.out.println("Sensor get deactivated");
    }
}
class Light extends Sensor
{
    public void highTraffic()
    {
        System.out.println("Red light is now ON");
        System.out.println("Yellow light is now OFF");
        System.out.println("Green light is now OFF");
        System.out.println("There is a huge traffic so you are not allow to cross the barricade");
    }
    public void lowTraffic()
    {
        System.out.println("Red light is now OFF");
        System.out.println("Yellow light is now ON");
        System.out.println("Green light is OFF");
        System.out.println("Wait for just a minute traffic is about to clear");
    }
    public void NoTraffic()
    {
        System.out.println("Red light is now OFF");
        System.out.println("Yellow light is now OFF");
        System.out.println("Green light is now ON");
        System.out.println("Now you can cross the barricade");
    }
}
