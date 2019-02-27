package org.usfirst.frc.team2412.robot.commands.lift;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.CommandBase;
import org.usfirst.frc.team2412.robot.subsystems.LiftSubsystem.LiftHeights;

public class GoToLevel extends CommandBase {

	public int level;
	public boolean hatch; // if this is true, it goes to a hatch level, false a cargo

	public GoToLevel(int level, boolean hatch) {
		this.level = level;
		this.hatch = hatch;
		requires(liftSubsystem);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void execute() {
		if (!hatch) {
			if (RobotMap.DEBUG_MODE) {
				System.out.println("Going to cargo " + level + ".");
			}
			liftSubsystem.goToInch(LiftHeights.CARGO.getInch(level));
		} else {
			if (RobotMap.DEBUG_MODE) {
				System.out.println("Going to hatch " + level + ".");
			}
			liftSubsystem.goToInch(LiftHeights.HATCH.getInch(level));
		}
	}
}
