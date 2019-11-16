package org.usfirst.frc.team2412.robot.commands;

public class InTakeUpDownStop extends CommandBase {
	public InTakeUpDownStop() {
		requires(inTakeUpDown);
	}

	public void execute() {
		inTakeUpDown.InTakeStop();
	}

	@Override
	protected boolean isFinished() {
		return false;
		// return !inTakeUpDown.limitSwitchUp();
	}
}
