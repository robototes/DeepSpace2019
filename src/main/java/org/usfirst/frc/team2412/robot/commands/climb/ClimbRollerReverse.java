package org.usfirst.frc.team2412.robot.commands.climb;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class ClimbRollerReverse extends CommandBase {

	public ClimbRollerReverse() {
		requires(climbRoller);
	}

	public void execute() {
		climbRoller.ClimbRollerReverese();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		climbRoller.ClimbRollerStop();
	}
}