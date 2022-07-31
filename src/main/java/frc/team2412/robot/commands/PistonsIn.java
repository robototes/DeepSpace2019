package frc.team2412.robot.commands;

public class PistonsIn extends CustomCommandBase {
	public PistonsIn() {
		addRequirements(pistonMove);
	}

	@Override
	public void execute() {
		pistonMove.pistonUp();
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}
