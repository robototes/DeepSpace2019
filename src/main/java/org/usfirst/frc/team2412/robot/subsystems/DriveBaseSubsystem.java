package org.usfirst.frc.team2412.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.JoystickDriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubsystem extends Subsystem {
	private DifferentialDrive robotDrive = RobotMap.drive;
	private boolean init = false;
	@Override
	protected void initDefaultCommand() {
		// Drive with the joystick by default.
		setDefaultCommand(new JoystickDriveCommand());
	}

	public void drive(double y, double turn, boolean safe) {
		if(!init){
			for(CANSparkMax motor: RobotMap.driveBaseMotors){
				motor.setSmartCurrentLimit(40);
			}
			init = true;
		}


		robotDrive.arcadeDrive(y*((safe)?1:0.35), turn*((safe)?1:0.35));
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
			turning = Math.min(Math.max(turning-0.05, -0.35), 0.35);
		} else {
			velocity = 0.7 * stick.getY();
			turning = 0.5
			 * stick.getTwist();
		}

		robotDrive.arcadeDrive(velocity, -turning, true);
	}
	public void distanceDrive(double rotations, double speed){
		CANSparkMax rightDriveLeader = RobotMap.driveBaseMotors[0];
		CANEncoder rightEncoder = rightDriveLeader.getEncoder();
		CANSparkMax leftDriveLeader = RobotMap.driveBaseMotors[3];
		CANEncoder leftEncoder = leftDriveLeader.getEncoder();
		if(rightEncoder.getPosition() < rotations){
		   RobotMap.leftSide.set(speed);
		}
		if(leftEncoder.getPosition() < rotations){
			leftDriveLeader.set(speed);
		}
	}
}