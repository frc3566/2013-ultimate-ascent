// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc3566.OfficialCode.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3566.OfficialCode.Robot;
/**
 *
 */
public class  openHock extends Command {
    public openHock() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //if (Robot.shooter.isIN()){
            Robot.shooter.openhock();
       // }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.shooter.isOpened();
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.shooter.stopHock();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
