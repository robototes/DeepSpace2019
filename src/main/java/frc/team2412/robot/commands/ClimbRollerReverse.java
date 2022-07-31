package frc.team2412.robot.commands;

public class ClimbRollerReverse extends CustomCommandBase {

	public ClimbRollerReverse() {
		addRequirements(climbRoller);
	}

	public void execute() {
		climbRoller.ClimbRollerReverese();
	}

	@Override
	public boolean isFinished() {
		return false;
	}

	@Override
	public void end(boolean interupted) {
		climbRoller.ClimbRollerStop();
	}
}