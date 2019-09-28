package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.JoystickDriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubsystem extends Subsystem {
	private DifferentialDrive robotDrive = RobotMap.drive;

	@Override
	protected void initDefaultCommand() {
		// Drive with the joystick by default.
		setDefaultCommand(new JoystickDriveCommand());
	}

	public void drive(double y, double turn) {
		robotDrive.arcadeDrive(y, turn, true);
	}

	public void drive(Joystick stick) {
		// robotDrive.arcadeDrive(stick.getY(), Math.pow(-stick.getTwist() * 0.8, 3), true);
		double velocity, turning;
		if(RobotMap.SAFE_MODE) {
			velocity = Math.min(Math.max(stick.getY(), -0.35), 0.35);
			if(stick.getRawButton(6)) {
				turning = stick.getX();
			} else {
				turning = stick.getTwist();
			}
			turning = Math.min(Math.max(turning, -0.35), 0.35);
		} else {
			velocity = 0.7 * stick.getY();
			turning = 0.7
			 * stick.getTwist();
		}

		robotDrive.arcadeDrive(velocity, -turning, true);
	}
}