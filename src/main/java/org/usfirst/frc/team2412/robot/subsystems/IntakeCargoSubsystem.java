package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeCargoSubsystem extends Subsystem {

	// RESEARCH TALONSRX CAPABILITIES AND EDUCATE THE TEAM
	private WPI_VictorSPX CargoMotor1 = RobotMap.cargoMotor1;

	@Override
	protected void initDefaultCommand() {
	}

	// CHANGE MOTOR SPEED TO CONSTANTS
	public void intakeCargo() {
		CargoMotor1.set(1);
	}

	public void outputCargo() {
		CargoMotor1.set(-1);
	}

	public void intakeStop() {
		CargoMotor1.set(0.0);
	}
	
	public void intakeCargoAxis(Joystick stick, int axis) {
		CargoMotor1.set(stick.getRawAxis(axis));
	}
}
