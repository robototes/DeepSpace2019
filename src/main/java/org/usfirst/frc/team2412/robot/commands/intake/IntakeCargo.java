package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class IntakeCargo extends CommandBase {
	public IntakeCargo() {
		requires(intakeCargo);
	}

	public void execute() {
		intakeCargo.intakeCargo();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
