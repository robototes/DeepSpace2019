package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class InTakeUp extends CommandBase {
	public InTakeUp() {
		requires(intakeUpDown);
	}

	public void execute() {
		intakeUpDown.intakeUp();
	}

	public void end() {
		intakeUpDown.intakeStop();
	}

	@Override
	protected boolean isFinished() {
		return !intakeUpDown.limitSwitchUp();
	}
}
