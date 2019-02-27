package org.usfirst.frc.team2412.robot.commands.climb;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class RetractRails extends CommandBase {
	public RetractRails() {
		requires(climbPneumatics);
	}

	public void execute() {
		climbPneumatics.RetractRails();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
