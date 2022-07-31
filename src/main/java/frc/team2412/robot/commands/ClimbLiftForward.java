package frc.team2412.robot.commands;

public class ClimbLiftForward extends CustomCommandBase {
	public ClimbLiftForward() {
		addRequirements(climbLift);
	}

	public void execute() {
		climbLift.ClimbLiftForward();
	System.out.println("Lift Forward");
	}

	@Override
	public boolean isFinished() {
		//return false;
		return climbLift.limitSwitchClimbForward();
	}
	@Override
	public void end(boolean i) {
		climbLift.ClimbLiftStop();
	}
}
