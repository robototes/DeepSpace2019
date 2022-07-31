package frc.team2412.robot.commands;

public class OutputCargo extends CustomCommandBase {
	public OutputCargo() {
		addRequirements(inTakeCargo);
	}

	@Override
	public void execute() {
		inTakeCargo.OutputCargo();
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}
