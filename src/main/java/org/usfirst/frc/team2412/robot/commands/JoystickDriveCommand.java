package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.RobotMap;

public class JoystickDriveCommand extends CommandBase {
	public JoystickDriveCommand() {
		requires(driveBase);
	}

	@Override
	protected void execute() {
		if(RobotMap.XBOX){
			driveBase.drive(Robot.m_oi.XboxController.getRawAxis(1), -Robot.m_oi.XboxController.getRawAxis(0), !RobotMap.SAFE_MODE);
			
		}else{
		driveBase.drive(Robot.m_oi.stick);
		}
	}
}