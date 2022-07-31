package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class ShiftOtherGearCommand extends CustomCommandBase {
	
	public ShiftOtherGearCommand() {
		addRequirements(driveShifters);
	}
	
	@Override
	public void execute() {
		if(RobotMap.CLIMB_MODE) {
			// driveShifters.shiftHighGear(); // Don't allow shifting in climb mode for nwo.
		} else {
			driveShifters.shiftLowGear();
		}
	}
	
	@Override
	public boolean isFinished() {
		return true;
	}
}
