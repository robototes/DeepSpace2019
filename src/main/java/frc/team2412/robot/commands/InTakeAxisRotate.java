package frc.team2412.robot.commands;

import frc.team2412.robot.OI;
import frc.team2412.robot.Robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class InTakeAxisRotate extends CustomCommandBase {
	public InTakeAxisRotate() {
		addRequirements(inTakeUpDown);
	}
	
	//The Initialize command initializes the counter in the above subsystem then starts the motor moving.
	//It then tests the counter value in the isFinished() method waiting for it to count the limit switch changing.
	//When it does, the arm stops.
	//By using a hardware counter, a switch that might close then open very quickly can still be caught by the program.

	public void execute() {
		System.out.println("Rotating intake axis with joystick...");
		inTakeUpDown.InTakeAxisRotate(Robot.m_oi.coDriverArduinoButtons, OI.MANUAL_AXIS);
		// SmartDashboard.putNumber("Intake rotation angle", inTakeUpDown.returnPIDInput());
		// System.out.println("Intake rotation angle: " + inTakeUpDown.returnPIDInput());
	}

	@Override
	public boolean isFinished() {
		return inTakeUpDown.limitSwitchDown();
		//return false;
	}

	@Override
	public void end(boolean i) {
		inTakeUpDown.InTakeStop();
	}
}