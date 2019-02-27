package org.usfirst.frc.team2412.robot.commands.drive;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class ShiftOtherGearCommand extends CommandBase {

	public ShiftOtherGearCommand() {
		requires(driveShifters);
	}

	@Override
	protected void execute() {
		if (RobotMap.CLIMB_MODE) {
			// driveShifters.shiftHighGear(); // Don't allow shifting in climb mode for nwo.
		} else {
			driveShifters.shiftLowGear();
		}
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
