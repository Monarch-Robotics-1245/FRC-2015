package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SimpleAutonomous extends CommandGroup {
    
    public  SimpleAutonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential(new ToggleGrip());
    	addSequential(new ToggleLift());
    	addSequential(new DirectionalDrive(0.0, 0.5, 1.0));
    	addSequential(new ToggleGrip());
    	addSequential(new ToggleLift());
    	addSequential(new ToggleGrip());
    	addSequential(new ToggleLift());
    	addSequential(new DirectionalDrive(-0.7, 0.0, 2.0));
    }
}