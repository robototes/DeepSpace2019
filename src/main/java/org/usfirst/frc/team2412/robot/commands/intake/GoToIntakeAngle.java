package org.usfirst.frc.team2412.robot.commands.intake;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.CommandBase;
import org.usfirst.frc.team2412.robot.subsystems.IntakeUpDownSubsystem;

public class GoToIntakeAngle extends CommandBase {
	private double angleSetpoint = 0;

	public GoToIntakeAngle(double angle) {
		requires(intakeUpDown);
		angleSetpoint = angle;
	}

	@Override
	protected void initialize() {
		intakeUpDown.setInputRange(0, IntakeUpDownSubsystem.MAX_ERROR);
		intakeUpDown.setOutputRange(IntakeUpDownSubsystem.MIN_SPEED, IntakeUpDownSubsystem.MAX_SPEED);
		intakeUpDown.setSetpoint(angleSetpoint);
		intakeUpDown.setAbsoluteTolerance(1); // Tolerate 1 degree of error. May need to calibrate.

		intakeUpDown.enable();
	}

	public void execute() {
		if (RobotMap.DEBUG_MODE) {
			System.out.println("Intake rotating to " + angleSetpoint + " degree(s)");
			System.out.println("Current angle: " + intakeUpDown.returnPIDInput() + " degree(s)");
			System.out.println("Calculated motor speed: " + intakeUpDown.getPIDController().get());
		}
	}

	public void end() {
		intakeUpDown.disable();
	}

	@Override
	protected boolean isFinished() {
		return intakeUpDown.onTarget();
	}
}
