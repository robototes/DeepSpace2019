package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class LiftBottomReset extends CustomCommandBase {

	public LiftBottomReset() {
		addRequirements(liftSubsystem);
	}

	@Override
	public void execute() {
		if (RobotMap.DEBUG_MODE) {
			System.out.println("Lift has reset to the bottom.");
		}
		liftSubsystem.resetBottom();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
