package frc.team2412.robot.commands;

import frc.team2412.robot.OI;
import frc.team2412.robot.Robot;
import frc.team2412.robot.RobotMap;

public class ClimbRollerAxis extends CustomCommandBase {

	public ClimbRollerAxis() {
		addRequirements(climbRoller);
	}

	public void execute() {
		// Check if climb mode is enabled - if it is, drive with the main joystick.
		// If not, use the codriver board.
		// This way, it doesn't matter who starts the command as long as we're in the right mode.
		if(RobotMap.CLIMB_MODE) {
			int forwardAxis = 1; // The joystick's y axis - moving the joystick forward will spin the roller forward
			climbRoller.ClimbRollerAxis(Robot.m_oi.stick, forwardAxis);
			System.out.println("Climbing roller axis with joystick in climb mode");
		} else {
			climbRoller.ClimbRollerAxis(Robot.m_oi.coDriverArduinoButtons, OI.MANUAL_AXIS);
			System.out.println("Climbing roller axis with codriver in manual mode.");
		}
	}

	@Override
	public boolean isFinished() {
		return false;
	}

	@Override
	public void end(boolean i) {
		climbRoller.ClimbRollerStop();
	}
}