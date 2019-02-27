package org.usfirst.frc.team2412.robot.commands.climb;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class DeployRails extends CommandBase {
	public DeployRails() {
		requires(climbPneumatics);
	}

	public void execute() {
		climbPneumatics.DeployRails();
		RobotMap.CLIMB_MODE = true;
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
