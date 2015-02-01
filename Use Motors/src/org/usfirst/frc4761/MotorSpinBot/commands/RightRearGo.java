package org.usfirst.frc4761.MotorSpinBot.commands;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4761.MotorSpinBot.RobotMap;

/**
 *
 */
public class  RightRearGo extends Command {
	double speed;
	SpeedController rr = RobotMap.driveTrainRightRear;
    public RightRearGo() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	speed = -1.0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	rr.set(speed);
    	speed += 0.05;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return speed >= 1.0;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
