package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class RetractRails extends CustomCommandBase {
	public RetractRails() {
		addRequirements(climbPneumatics);
	}

	@Override
	public void execute() {
		climbPneumatics.RetractRails();
		RobotMap.CLIMB_MODE = false;
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}
