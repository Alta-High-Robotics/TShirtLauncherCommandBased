package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotData;
import frc.robot.RobotMap;

public class LauncherSubsystem extends Subsystem {

	Victor armSpeed = new Victor(RobotMap.VICTOR_LAUNCHER); //raise and lower mechanism
	Solenoid launcher = new Solenoid(RobotMap.LAUNCHER_PNEUMATIC); //air launcher

	/**
	 * Launch the pnuematic solenoid (for the t-shirts)
	 * @param launching to release the pnuematic (on/off)
	 *
	 * */
	public void fire(boolean launching) {
		launcher.set(launching);
	}

	public void raise() {
		armSpeed.set(RobotData.LAUNCHER_RAISE_SPEED);
	}

	public void lower() {
		armSpeed.set(-1*RobotData.LAUNCHER_LOWER_SPEED);
	}

	public void stopMovement() {
		armSpeed.set(0);
	}

	@Override
	protected void initDefaultCommand() {

	}
}
