package org.usfirst.frc.team2412.robot.commands.climb;

import org.usfirst.frc.team2412.robot.OI;
import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class ClimbLiftJoystick extends CommandBase {

	public ClimbLiftJoystick() {
		requires(climbLift);
	}

	public void execute() {
		climbLift.ClimbLiftJoystick(Robot.m_oi.coDriver, OI.MANUAL_AXIS);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		climbLift.ClimbLiftStop();
	}
}
