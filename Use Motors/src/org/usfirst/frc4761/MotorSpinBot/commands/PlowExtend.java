package org.usfirst.frc4761.MotorSpinBot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4761.MotorSpinBot.Robot;

public class PlowExtend extends Command {
	
	public PlowExtend() {
		requires(Robot.plower);
	}
	
	protected void initialize() {
		setTimeout(1);
	}
	
	protected void execute() {
		Robot.plower.set(DoubleSolenoid.Value.kForward);
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	protected void end() {
	}
	
	protected void interrupted() {
	}
}
