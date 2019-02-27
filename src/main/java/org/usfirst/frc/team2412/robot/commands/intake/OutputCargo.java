package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class OutputCargo extends CommandBase {
	public OutputCargo() {
		requires(intakeCargo);
	}

	public void execute() {
		intakeCargo.outputCargo();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
