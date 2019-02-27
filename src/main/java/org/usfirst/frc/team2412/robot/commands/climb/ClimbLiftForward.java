package org.usfirst.frc.team2412.robot.commands.climb;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class ClimbLiftForward extends CommandBase {
	public ClimbLiftForward() {
		requires(climbLift);
	}

	public void execute() {
		climbLift.ClimbLiftForward();
		System.out.println("Lift Forward");
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		climbLift.ClimbLiftStop();
	}
}
