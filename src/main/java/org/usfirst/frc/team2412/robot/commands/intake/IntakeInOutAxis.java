package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.OI;
import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class IntakeInOutAxis extends CommandBase {
	public IntakeInOutAxis() {
		requires(intakeCargo);
	}

	public void execute() {
		intakeCargo.intakeCargoAxis(Robot.m_oi.coDriver, OI.MANUAL_AXIS);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
