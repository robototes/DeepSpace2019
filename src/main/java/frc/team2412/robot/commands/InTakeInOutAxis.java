package frc.team2412.robot.commands;

import frc.team2412.robot.OI;
import frc.team2412.robot.Robot;

public class InTakeInOutAxis extends CustomCommandBase {
	public InTakeInOutAxis() {
		addRequirements(inTakeCargo);
	}

	@Override
	public void execute() {
		System.out.println("Intake cargo axis");
		inTakeCargo.InTakeCargoAxis(Robot.m_oi.coDriverArduinoButtons, OI.MANUAL_AXIS);
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}
