package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class PistonsIn extends CommandBase {
	public PistonsIn() {
		requires(pistonMove);
	}

	public void execute() {
		pistonMove.pistonUp();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
