package frc.team2412.robot.commands;

public class InTakeUp extends CustomCommandBase {
	public InTakeUp() {
		addRequirements(inTakeUpDown);
	}

	@Override
	public void execute() {
		inTakeUpDown.InTakeUp();
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
