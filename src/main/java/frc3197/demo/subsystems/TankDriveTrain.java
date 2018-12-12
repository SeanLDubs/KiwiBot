package frc3197.demo.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc3197.demo.RobotMap;
import frc3197.demo.commands.TankDrive;

public class TankDriveTrain extends DriveTrain {
  Spark left = new Spark(RobotMap.leftSparkChannel);
  Spark right = new Spark(RobotMap.rightSparkChannel);

  DifferentialDrive drive = new DifferentialDrive(left, right);

  public TankDriveTrain() {
    drive.setDeadband(RobotMap.deadband);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
  }

  public void drive(double x, double y, double r) {
    drive.arcadeDrive(y, r, RobotMap.squaredInputs);
  }

  
}
