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
    public static VictorSP driveTrainLeftFront;
    public static VictorSP driveTrainLeftRear;
    public static VictorSP driveTrainRightFront;
    public static VictorSP driveTrainRightRear;
    public static VictorSP elevator1;
    public static VictorSP elevator2;
    public static RobotDrive driveTrainRoboDrive;
    public static DoubleSolenoid rcpneumatic = new DoubleSolenoid(0, 0, 1);
	public static DoubleSolenoid plowpneumatic = new DoubleSolenoid(0, 2, 3);

    public static void init() {
        driveTrainLeftFront = new VictorSP(3);
        LiveWindow.addActuator("Drive Train", "Left Front", driveTrainLeftFront);
        
        driveTrainLeftRear = new VictorSP(0);
        LiveWindow.addActuator("Drive Train", "Left Rear", driveTrainLeftRear);
        
        driveTrainRightFront = new VictorSP(2);
        LiveWindow.addActuator("Drive Train", "Right Front", driveTrainRightFront);
        
        driveTrainRightRear = new VictorSP(1);
        LiveWindow.addActuator("Drive Train", "Right Rear", driveTrainRightRear);
        
        driveTrainRoboDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        driveTrainRoboDrive.setSafetyEnabled(true);
        driveTrainRoboDrive.setExpiration(0.1);
        driveTrainRoboDrive.setSensitivity(0.5);
        driveTrainRoboDrive.setMaxOutput(1.0);
        
        elevator1 = new VictorSP(8);
        LiveWindow.addActuator("Elevator", "Elevator 1", elevator1);
        
        elevator1 = new VictorSP(9);
        LiveWindow.addActuator("Elevator", "Elevator 2", elevator2);
    }
}
