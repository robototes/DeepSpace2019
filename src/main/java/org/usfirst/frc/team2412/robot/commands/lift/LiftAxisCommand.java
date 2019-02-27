package org.usfirst.frc.team2412.robot.commands.lift;

import org.usfirst.frc.team2412.robot.OI;
import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class LiftAxisCommand extends CommandBase {

	public LiftAxisCommand() {
		requires(liftSubsystem);
	}
	 
	public void execute() {
		liftSubsystem.liftAxis(Robot.m_oi.coDriver.getRawAxis(OI.MANUAL_AXIS), 0, 1, 0.2, false);
	}

	protected void end() {
		liftSubsystem.liftStop();
	}
}
