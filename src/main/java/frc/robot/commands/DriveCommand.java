package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.RobotMap;

public class DriveCommand extends Command {

	public DriveCommand() {
		requires(Robot.driveTrain);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		double left_axis = Robot.oi.getController().getRawAxis(RobotMap.CONTROLLER_AXIS_LEFT);
		double right_axis = Robot.oi.getController().getRawAxis(RobotMap.CONTROLLER_AXIS_RIGHT);
		Robot.driveTrain.drive(left_axis, right_axis);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}