package org.usfirst.frc4761.MotorSpinBot.commands;

import org.usfirst.frc4761.MotorSpinBot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LowerElevator extends Command {

    public LowerElevator() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

 // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.elevator1.set(-0.25);
    	RobotMap.elevator2.set(-0.25);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (isTimedOut()) {
    		RobotMap.elevator1.set(0);
    		RobotMap.elevator2.set(0);
    	}
    	
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
