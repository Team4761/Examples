package org.usfirst.frc4761.MotorSpinBot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4761.MotorSpinBot.Robot;

public class RcOff extends Command {
	
	DoubleSolenoid solenoid = Robot.rcGrabber.solenoid;
	
	public RcOff() {
		requires(Robot.rcGrabber);
	}
	
	protected void initialize() {
		setTimeout(1);
	}
	
	protected void execute() {
		solenoid.set(DoubleSolenoid.Value.kOff);
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	protected void end() {
	}
	
	protected void interrupted() {
	}
}
