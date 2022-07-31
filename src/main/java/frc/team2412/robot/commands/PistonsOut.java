package frc.team2412.robot.commands;

public class PistonsOut extends CustomCommandBase {
	public PistonsOut() {
		addRequirements(pistonMove);
	}

	@Override
	public void execute() {
		pistonMove.pistonDown();
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}
