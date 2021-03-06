package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.OI;
import org.usfirst.frc.team2412.robot.Robot;

public class InTakeInOutAxis extends CommandBase {
	public InTakeInOutAxis() {
		requires(inTakeCargo);
	}

	public void execute() {
		System.out.println("Intake cargo axis");
		inTakeCargo.InTakeCargoAxis(Robot.m_oi.coDriverArduinoButtons, OI.MANUAL_AXIS);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
