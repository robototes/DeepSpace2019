package frc.team2412.robot.commands;

public class ClimbRollerForward extends CustomCommandBase {

	public ClimbRollerForward() {
		addRequirements(climbRoller);
	}

	public void execute() {
		climbRoller.ClimbRollerForward();
	}

	@Override
	public boolean isFinished() {
		return false;
	}

	@Override
	public void end(boolean i) {
		climbRoller.ClimbRollerStop();
	}
}