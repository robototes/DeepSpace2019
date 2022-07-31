package frc.team2412.robot.commands;

public class InTakeStop extends CustomCommandBase {
	public InTakeStop() {
		addRequirements(inTakeCargo);
	}

	@Override
	public void execute() {
		inTakeCargo.InTakeStop();
	}
}