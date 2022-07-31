package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class DeployRails extends CustomCommandBase {
	public DeployRails() {
		addRequirements(climbPneumatics);
	}

	@Override
	public void execute() {
		climbPneumatics.DeployRails();
		RobotMap.CLIMB_MODE = true;
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}
