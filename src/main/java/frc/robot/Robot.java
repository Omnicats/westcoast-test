// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.Constants.CANIds;

/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs the motors with
 * arcade steering.
 */
public class Robot extends TimedRobot {
  private final MotorControllerGroup left = new MotorControllerGroup(
    new CANSparkMax(CANIds.kLeftMotor1, MotorType.kBrushless),
    new CANSparkMax(CANIds.kLeftMotor2, MotorType.kBrushless)
  );
  private final MotorControllerGroup right = new MotorControllerGroup(
    new CANSparkMax(CANIds.kRightMotor1, MotorType.kBrushless),
    new CANSparkMax(CANIds.kRightMotor2, MotorType.kBrushless)
  );
  private final DifferentialDrive drive = new DifferentialDrive(left, right);
  private final XboxController controller = new XboxController(0);

  @Override
  public void robotInit() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
    right.setInverted(true);
  }

  @Override
  public void teleopPeriodic() {
    // Drive with arcade drive.
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
    double speed = -controller.getLeftY();
    double turn = controller.getRightX();
    drive.arcadeDrive(speed, turn);
  }
}
