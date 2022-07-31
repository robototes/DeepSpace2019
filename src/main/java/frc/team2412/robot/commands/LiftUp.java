package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class LiftUp extends CustomCommandBase {

	public LiftUp() {
		addRequirements(liftSubsystem);
	}

	@Override
	public boolean isFinished() {
		return false;
	}

	@Override
	public void execute() {
		if (RobotMap.DEBUG_MODE) {
			System.out.println("Lift up.");
		}
		liftSubsystem.liftUp();
	}

	@Override
	public void end(boolean i) {
		liftSubsystem.liftStop();
	}
}
