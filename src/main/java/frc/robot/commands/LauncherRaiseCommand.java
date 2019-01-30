package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class LauncherRaiseCommand extends Command {
	public LauncherRaiseCommand() {
		requires(Robot.launcher);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.launcher.raise();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.launcher.stopMovement();
	}

	@Override
	protected void interrupted() {
		end();
	}

	@Override
	public void setName(String subsystem, String name) {

	}
}
