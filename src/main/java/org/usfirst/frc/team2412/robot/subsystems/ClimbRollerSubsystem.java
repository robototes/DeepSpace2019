package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimbRollerSubsystem extends Subsystem {

	private VictorSP victorSP3 = RobotMap.victorSP3;

	public double rollerSpeed = 1;
	
	@Override
	protected void initDefaultCommand() {

	}

	public void ClimbRollerForward() {
		victorSP3.set(rollerSpeed);
	}

	public void ClimbRollerReverese() {
		victorSP3.set(-rollerSpeed);
	}

	public void ClimbRollerStop() {
		victorSP3.set(0.0);
		System.out.println("released");
	}
	
	public void ClimbRollerAxis(Joystick stick, int axis) {
		victorSP3.set(stick.getRawAxis(axis));
	}

}
