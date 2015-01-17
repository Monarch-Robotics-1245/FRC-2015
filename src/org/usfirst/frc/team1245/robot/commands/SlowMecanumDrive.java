package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SlowMecanumDrive extends Command {

    public SlowMecanumDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double x = OI.deadZone(OI.driverJoystick.getX()/2, RobotMap.translationalDeadZone/2);
    	double y = OI.deadZone(OI.driverJoystick.getY()/2, RobotMap.rotationalDeadZone/2);
    	double twist = OI.deadZone(OI.driverJoystick.getTwist()/2, RobotMap.rotationalDeadZone/2);
    	
    	Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(x, y, twist, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}