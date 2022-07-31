package frc.team2412.robot.commands;

public class InTakeStow extends CustomCommandBase {
	public InTakeStow() {
		addRequirements(inTakeUpDown);
	}

	@Override
	public void execute() {
		inTakeUpDown.InTakeHold();
	}

	@Override
	public void end(boolean i) {
		inTakeUpDown.InTakeStop();
	}

	@Override
	public boolean isFinished() {
		return false;
		// return !inTakeUpDown.limitSwitchUp();
	}
}
