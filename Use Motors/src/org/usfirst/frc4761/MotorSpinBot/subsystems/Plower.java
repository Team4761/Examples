package org.usfirst.frc4761.MotorSpinBot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4761.MotorSpinBot.RobotMap;

/**
 * Wedge for moving totes out of the way.
 */
public class Plower extends Subsystem {
	
	private DoubleSolenoid solenoid = RobotMap.plowpneumatic;
	
	public void initDefaultCommand() {
	}
	
	public void set(DoubleSolenoid.Value value) {
		solenoid.set(value);
	}
}

