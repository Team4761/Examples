package org.usfirst.frc4761.MotorSpinBot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4761.MotorSpinBot.RobotMap;

/**
 * Arm with a hook on the end that can grab RCs
 */
public class RcGrabber extends Subsystem {
	
	public DoubleSolenoid solenoid = RobotMap.rcpneumatic;
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	
	public void set(DoubleSolenoid.Value value) {
		solenoid.set(value);
	}
}
