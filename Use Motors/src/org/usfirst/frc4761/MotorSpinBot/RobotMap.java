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
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftRear;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightRear;
    public static RobotDrive driveTrainRoboDrive;
    public static Gyro driveTrainGyro;
    public static AnalogInput driveTrainDistanceSensor;

    public static void init() {
        driveTrainLeftFront = new Talon(3);
        LiveWindow.addActuator("Drive Train", "Left Front", (Talon) driveTrainLeftFront);
        
        driveTrainLeftRear = new Talon(0);
        LiveWindow.addActuator("Drive Train", "Left Rear", (Talon) driveTrainLeftRear);
        
        driveTrainRightFront = new Talon(2);
        LiveWindow.addActuator("Drive Train", "Right Front", (Talon) driveTrainRightFront);
        
        driveTrainRightRear = new Talon(1);
        LiveWindow.addActuator("Drive Train", "Right Rear", (Talon) driveTrainRightRear);
        
        driveTrainRoboDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        driveTrainRoboDrive.setSafetyEnabled(true);
        driveTrainRoboDrive.setExpiration(0.1);
        driveTrainRoboDrive.setSensitivity(0.5);
        driveTrainRoboDrive.setMaxOutput(1.0);

        driveTrainGyro = new Gyro(0);
        LiveWindow.addSensor("Drive Train", "Gyro", driveTrainGyro);
        driveTrainGyro.setSensitivity(0.007);
        driveTrainDistanceSensor = new AnalogInput(2);
        LiveWindow.addSensor("Drive Train", "Distance Sensor", driveTrainDistanceSensor);
    }
}
