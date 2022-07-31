package frc.team2412.robot.commands;

public class InTakeCargo extends CustomCommandBase {
	public InTakeCargo() {
		addRequirements(inTakeCargo);
	}

	@Override
	public void execute() {
		inTakeCargo.InTakeCargo();
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
