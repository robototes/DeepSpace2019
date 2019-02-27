package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchSensorsSubsystem extends Subsystem {

	public HatchSensorsSubsystem() {

	}

	public boolean input1() {
		return RobotMap.limitSwitch1.get();
	}

	public void LEDon() {
		RobotMap.led1.set(true);
	}

	@Override
	protected void initDefaultCommand() {

	}

}
