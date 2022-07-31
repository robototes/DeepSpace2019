package frc.team2412.robot.commands;

import frc.team2412.robot.Robot;
import frc.team2412.robot.subsystems.DriveBaseSubsystem;

public class JoystickDriveCommand extends CustomCommandBase {
	private final DriveBaseSubsystem m_drivebase;

	public JoystickDriveCommand(DriveBaseSubsystem pDriveBase) {
		m_drivebase = pDriveBase;
		addRequirements(m_drivebase);
	}

	@Override
	public void initialize() {
		System.out.println("initializing...");
	}

	@Override
	public void execute() {
		System.out.println("driving...");
		m_drivebase.drive(Robot.m_oi.stick);
	}

	@Override
	public void end(boolean i) {
		System.out.println("end");
	}
}