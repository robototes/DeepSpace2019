package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class ClimbLiftPulse extends CommandBase {
	private long startTime;

	public ClimbLiftPulse() {
		requires(climbLift);
	}

	public void start() {
		super.start();
		startTime = System.currentTimeMillis();
	}

	public void execute() {
		if(RobotMap.CLIMB_MODE) {
			return;
		} else if(getElapsedTime() % 25 < 5) {
			climbLift.ClimbLiftPulse();
		} else {
			climbLift.ClimbLiftStop();
		}
	}

	private double getElapsedTime() {
		return (System.currentTimeMillis() - startTime) / 1000d;
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		climbLift.ClimbLiftStop();
	}
}
