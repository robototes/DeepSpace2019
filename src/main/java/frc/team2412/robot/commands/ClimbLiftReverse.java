package frc.team2412.robot.commands;

public class ClimbLiftReverse extends CustomCommandBase {

	public ClimbLiftReverse() {
		addRequirements(climbLift);
	}

	public void execute() {
		climbLift.ClimbLiftReverse();
System.out.println("Climb Reverse");
}

	@Override
	public boolean isFinished() {
		return climbLift.limitSwitchClimbReverse();
	}
	public void end(boolean i) {
		climbLift.ClimbLiftStop();
	}
}
