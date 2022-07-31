package frc.team2412.robot.commands;

import frc.team2412.robot.RobotMap;

public class GoToLevel extends CustomCommandBase {

	public int level;
	public boolean hatch; // if this is true, it goes to a hatch level, false a cargo

	private static final double MAX_ERROR = 4;

	public GoToLevel(int level, boolean hatch) {
		this.level = level;
		this.hatch = hatch;
		addRequirements(liftSubsystem);
	}

	@Override
	public boolean isFinished() {
		double error = liftSubsystem.getError();
		System.out.println("Error: " + error);
		return error < MAX_ERROR;
	}

	@Override
	public void execute() {
		if (!hatch) {
			if (RobotMap.DEBUG_MODE) {
				System.out.println("Going to cargo " + level + ".");
			}
			liftSubsystem.goToInch(27.5 + (level - 1) * 28);
		} else {
			if (RobotMap.DEBUG_MODE) {
				System.out.println("Going to hatch " + level + ".");
			}
			liftSubsystem.goToInch(19 + (level - 1) * 28);
		}
	}
}
