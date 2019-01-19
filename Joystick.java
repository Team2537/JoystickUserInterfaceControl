package frc.robot;

// Import the classes of objects you will use
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.CameraServer;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Joystick extends IterativeRobot {
  // Create instances of each object
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();
  private XboxController xbox;
  private Timer timer;
  private Talon m_rearLeft;
  private Talon m_rearRight;
  private Talon m_frontLeft;
  private Talon m_frontRight;
  private DifferentialDrive m_drive;
  private boolean    f_safetyStop;
  private Ultrasonic f_ultrasonic;
  private double height;
  private int buttonMid1;
  private int buttonLeft1;
  private int buttonRight1;
  private int buttonLow1;
  private int buttonMid2;
  private int buttonLeft2;
  private int buttonRight2;
  private int buttonLow2;

  //this code will test each joystick on placing cargo(1) and hatches (2)
 public static void main(String[] args){
 int choice;
    if (choice==1)
    {
        //activiates Joystick1 commands
        Joystick1();
    }
    else if(choice==2)
    {
         //activiates Joystick2 commands
        Joystick2();
    }
}
public void Joystick1();
{
 int buttonpress=-1;
 int stick=1;
    switch(buttonpress)
    {
        //sets Initial height to cargo level 1
        case 0: setInitial(stick);
        break;
        //decreases height of grabber
          //holding button will activate manual
        case 1: decreaseHeight(stick);
        break;
        //increases height of grabber
        //holding button will activate manual
        case 2: increaseHeight(stick);
        break;
        //intakes cargo and hatch
        case 3: intake(stick);
        break;
        //places crago and hatch on rocket/ship
        case 4: place(stick);
        break;
    }
}
public void Joystick2();
{
 int buttonpress=-1;
 int stick=2;
    switch(buttonpress)
    {
         //sets Initial height to cargo level 1
         case 0: setInitial(stick);
         break;
         //decreases height of grabber
         //holding button will activate manual
         case 1: decreaseHeight(stick);
         break;
         //increases height of grabber
         //holding button will activate manual
         case 2: increaseHeight(stick);
         break;
         //intakes cargo and hatch
         case 3: intake(stick);
         break;
         //places crago and hatch on rocket/ship
         case 4: place(stick);
         break;
    }
}
public void setInitial(int stick)
{ 
    if(stick==1)
    {
        height=27.5;
    }
    else if(stick==2)
    {
        height=19;
    }
}
public void decreaseHeight(int stick)
{
    if (stick==1)
    {

    }
    else if(stick==2)
    {

    }
}
public void increaseHeight(int stick)
{
    if(stick==1)
    {

    }
    else if(stick==2)
    {

    }
}
public void intake(int stick)
{
    if(stick==1)
    {

    }
    else if(stick==2)
    {

    }
}
public void place(int stick)
{
    if(stick==1)
    {

    }
    else if(stick==2)
    {

    }
}
 }