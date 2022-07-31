package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class LiftTopReset extends CustomCommandBase {

	public LiftTopReset() {
		addRequirements(liftSubsystem);
	}

	@Override
	public void execute() {
		if (RobotMap.DEBUG_MODE) {
			System.out.println("Lift has reset to the top.");
		}
		liftSubsystem.resetTop();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
