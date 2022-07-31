package frc.team2412.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.team2412.robot.RobotMap;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;

public class InTakeUpDownSubsystem extends PIDSubsystem {

	// PID conversion and unit values
	private double potentiometerAngleRange = 350; // This is the range of angles that the potentiometer can produce,
													// regardless of the actual angles intake will be at.
	private double potentiometerAngleOffset = 0; // The angle offset to add to the potentiometer's angle value.

	public static final double MIN_SPEED = -0.7; // Min motor speed - used to restrict how fast the motor turns.
	public static final double MAX_SPEED = 0.7; // Max motor speed - used for default KP calculations.
	public static final double MAX_ERROR = 350; // Max angle error in degrees - used for default KP calculations.

	// Default PID values
	private static final double DEFAULT_KP = MAX_SPEED / MAX_ERROR;
	private static final double DEFAULT_KI = 0.0;
	private static final double DEFAULT_KD = 0.0;
	
	// Potentiometer for measuring angle
	private AnalogPotentiometer potentiometer;
	private int potentiometerID = 1;

	private DigitalInput limitSwitchUp = RobotMap.limitSwitchUp;
	private DigitalInput limitSwitchDown = RobotMap.limitSwitchDown;
	private WPI_VictorSPX armMotor1 = RobotMap.armMotor1;
	
	public InTakeUpDownSubsystem() {
		this(DEFAULT_KP, DEFAULT_KI, DEFAULT_KD);
	}

	public InTakeUpDownSubsystem(double KP, double KI, double KD) {
		super(new PIDController(KP, KI, KD));
		//potentiometer = new AnalogPotentiometer(potentiometerID, potentiometerAngleRange, potentiometerAngleOffset);
	}

	public void InTakeUp() {
		armMotor1.set(0.5);
	}

	public void InTakeDown() {
		armMotor1.set(0.5);
	}

	public void InTakeStop() {
		armMotor1.set(0.0);
	}

	public void InTakeHold() {
		armMotor1.set(0.1);
	}

	public void InTakeAxisRotate(Joystick stick, int axis) {
		armMotor1.set(-stick.getRawAxis(axis));
	}

	public boolean limitSwitchUp() {
		//return false;
		return limitSwitchUp.get();
	}

	public boolean limitSwitchDown() {
		//return false;
		return limitSwitchDown.get();
	}

	@Override
	protected void useOutput(double speed, double setpoint) {
		armMotor1.set(-speed);
	}

	@Override
	protected double getMeasurement() {
		//return potentiometer.get();
		return 0;
	}
}
