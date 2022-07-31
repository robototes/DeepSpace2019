package frc.team2412.robot.commands;

import frc.team2412.robot.subsystems.DriveBaseShifterSubsystem;
import frc.team2412.robot.subsystems.DriveBaseSubsystem;
import frc.team2412.robot.subsystems.ClimbLiftSubsystem;
import frc.team2412.robot.subsystems.ClimbPneumaticsSubsystem;
import frc.team2412.robot.subsystems.ClimbRollerSubsystem;
import frc.team2412.robot.subsystems.InTakeCargoSubsystem;
import frc.team2412.robot.subsystems.InTakeUpDownSubsystem;
import frc.team2412.robot.subsystems.LiftSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.team2412.robot.subsystems.HatchIntake;
import frc.team2412.robot.subsystems.HatchSensors;

public class CustomCommandBase extends CommandBase {
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static DriveBaseShifterSubsystem driveShifters = new DriveBaseShifterSubsystem();
	public static InTakeUpDownSubsystem inTakeUpDown = new InTakeUpDownSubsystem(0.02, 0, 0);
	public static InTakeCargoSubsystem inTakeCargo = new InTakeCargoSubsystem();
	public static ClimbPneumaticsSubsystem climbPneumatics = new ClimbPneumaticsSubsystem();
	public static ClimbRollerSubsystem climbRoller = new ClimbRollerSubsystem();
	public static ClimbLiftSubsystem climbLift = new ClimbLiftSubsystem();
	public static LiftSubsystem liftSubsystem = new LiftSubsystem();
	public static HatchIntake pistonMove = new HatchIntake();
	public static HatchSensors hatchSensors = new HatchSensors();

	@Override
	public boolean isFinished() {
		return false;
	}
}
