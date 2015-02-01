package org.usfirst.frc4761.MotorSpinBot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static Talon driveTrainLeftFront;
    public static Talon driveTrainLeftRear;
    public static Talon driveTrainRightFront;
    public static Talon driveTrainRightRear;
    public static Talon conveyorBelt;
    public static RobotDrive driveTrainRoboDrive;
    public static Gyro driveTrainGyro;
    public static AnalogInput driveTrainDistanceSensor;

    public static void init() {
        driveTrainLeftFront = new Talon(3);
        LiveWindow.addActuator("Drive Train", "Left Front", driveTrainLeftFront);
        
        driveTrainLeftRear = new Talon(0);
        LiveWindow.addActuator("Drive Train", "Left Rear", driveTrainLeftRear);
        
        driveTrainRightFront = new Talon(2);
        LiveWindow.addActuator("Drive Train", "Right Front", driveTrainRightFront);
        
        driveTrainRightRear = new Talon(1);
        LiveWindow.addActuator("Drive Train", "Right Rear", driveTrainRightRear);
        
        driveTrainRoboDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        driveTrainRoboDrive.setSafetyEnabled(true);
        driveTrainRoboDrive.setExpiration(0.1);
        driveTrainRoboDrive.setSensitivity(0.5);
        driveTrainRoboDrive.setMaxOutput(1.0);
        
        conveyorBelt = new Talon(4);
        LiveWindow.addActuator("Conveyor Belt", "Conveyor Belt", conveyorBelt);
    }
}
