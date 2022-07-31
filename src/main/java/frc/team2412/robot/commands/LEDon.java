package frc.team2412.robot.commands;

public class LEDon extends CustomCommandBase {

	public LEDon() {
		addRequirements(hatchSensors);
	}

	@Override
	public void execute() {
		if (hatchSensors.input1()) {
			hatchSensors.LEDon();
		}
	}
}
