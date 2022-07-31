package frc.team2412.robot.commands;

public class HoldCargo extends CustomCommandBase {
	public HoldCargo() {
		addRequirements(inTakeCargo);
	}

	@Override
	public void execute() {
		inTakeCargo.HoldCargo();
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
