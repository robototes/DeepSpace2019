package frc.team2412.robot.commands;

import frc.team2412.robot.OI;
import frc.team2412.robot.Robot;

public class ClimbLiftJoystick extends CustomCommandBase {

	public ClimbLiftJoystick() {
		addRequirements(climbLift);
	}

	@Override
	public void execute() {
		climbLift.ClimbLiftJoystick(Robot.m_oi.coDriverArduinoButtons, OI.MANUAL_AXIS);
	}

	@Override
	public boolean isFinished() {
		return false;
		// return climbLift.limitSwitchClimbForward();
	}
	@Override
	public void end(boolean i) {
		climbLift.ClimbLiftStop();
	}
}
