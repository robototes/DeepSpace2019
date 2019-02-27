package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class IntakeStop extends CommandBase {
	public IntakeStop() {
		requires(intakeCargo);
	}

	public void execute() {
		intakeCargo.intakeStop();
	}
}