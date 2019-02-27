package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.DriveBaseShifterSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.ClimbLiftSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.ClimbPneumaticsSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.ClimbRollerSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeCargoSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeUpDownSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.LiftSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.HatchIntakeSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.HatchSensorsSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static DriveBaseShifterSubsystem driveShifters = new DriveBaseShifterSubsystem();
	public static IntakeUpDownSubsystem intakeUpDown = new IntakeUpDownSubsystem();
	public static IntakeCargoSubsystem intakeCargo = new IntakeCargoSubsystem();
	public static ClimbPneumaticsSubsystem climbPneumatics = new ClimbPneumaticsSubsystem();
	public static ClimbRollerSubsystem climbRoller = new ClimbRollerSubsystem();
	public static ClimbLiftSubsystem climbLift = new ClimbLiftSubsystem();
	public static LiftSubsystem liftSubsystem = new LiftSubsystem();
	public static HatchIntakeSubsystem pistonMove = new HatchIntakeSubsystem();
	public static HatchSensorsSubsystem hatchSensors = new HatchSensorsSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}
}
