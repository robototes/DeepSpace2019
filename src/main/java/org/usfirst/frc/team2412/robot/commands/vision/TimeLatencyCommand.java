package org.usfirst.frc.team2412.robot.commands.vision;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TimeLatencyCommand extends CommandGroup {
	public TimeLatencyCommand() {
		// addSequential(new LEDOnCommand());
		addSequential(new VisionGuidanceCommand());
	}
}