package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class LiftDown extends CustomCommandBase {

	public LiftDown() {
		addRequirements(liftSubsystem);
	}

	@Override
	public boolean isFinished() {
		return false;
	}

	@Override
	public void execute() {
		if (RobotMap.DEBUG_MODE) {
			System.out.println("Lift down.");
		}
		liftSubsystem.liftDown();
	}

	@Override
	public void end(boolean i) {
		liftSubsystem.liftStop();
	}
}
