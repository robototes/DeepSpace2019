package org.usfirst.frc.team2412.robot.commands.lift;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class LiftBottomReset extends CommandBase {

	public LiftBottomReset() {
		requires(liftSubsystem);
	}

	public void execute() {
		if (RobotMap.DEBUG_MODE) {
			System.out.println("Lift has reset to the bottom.");
		}
		liftSubsystem.resetBottom();
	}

	public boolean isFinished() {
		return true;
	}

}
