package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.OI;
import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class IntakeAxisRotate extends CommandBase {
	public IntakeAxisRotate() {
		requires(intakeUpDown);
	}

	// The Initialize command initializes the counter in the above subsystem then
	// starts the motor moving.
	// It then tests the counter value in the isFinished() method waiting for it to
	// count the limit switch changing.
	// When it does, the arm stops.
	// By using a hardware counter, a switch that might close then open very quickly
	// can still be caught by the program.

	public void execute() {
		intakeUpDown.intakeAxisRotate(Robot.m_oi.coDriver, OI.MANUAL_AXIS);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	public void end() {
		intakeUpDown.intakeStop();
	}
}