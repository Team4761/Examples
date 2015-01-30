package org.usfirst.frc.team4761.distancesensortest;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * This is a demo program showing the use of the RobotDrive class.
 * The SampleRobot class is the base of a robot application that will automatically call your
 * Autonomous and OperatorControl methods at the right time as controlled by the switches on
 * the driver station or the field controls.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're inexperienced,
 * don't. Unless you know what you are doing, complex code will be much more difficult under
 * this system. Use IterativeRobot or Command-Based instead if you're new.
 */
public class Robot extends SampleRobot {
    RobotDrive myRobot;
    Talon leftFront = new Talon(1);
    Talon leftRear = new Talon(2);
    Talon rightFront = new Talon(3);
    Talon rightRear = new Talon(4);
    AnalogInput sensor = new AnalogInput(2);
    Gyro gyro = new Gyro(0);
    
    public Robot() {
        myRobot = new RobotDrive(leftFront, leftRear, rightFront, rightRear);
    }

    public void autonomous() {
    	while(true) {
    		myRobot.mecanumDrive_Cartesian(-0.3, 0, 0, gyro.getAngle());
    		System.out.println(getDistanceFromWall());
    		try { Thread.sleep(20); }
    		catch (InterruptedException e) { e.printStackTrace(); }
    	}
    }

    public void operatorControl() {
    	//stub
    }

    public void test() {
    	//stub
    }
    
    double getDistanceFromWall() {
    	return ((sensor.getVoltage()) * 1000.0 / 4.885) * 5;
    }
}
