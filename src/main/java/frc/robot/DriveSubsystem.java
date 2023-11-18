package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.Constants.CANIds;

public class DriveSubsystem {
    CANSparkMax left1, left2, right1, right2;
    RelativeEncoder leftEncoder1, leftEncoder2, rightEncoder1, rightEncoder2;

    DriveSubsystem() {
        left1 = new CANSparkMax(CANIds.kLeftMotor1, MotorType.kBrushless);
        left2 = new CANSparkMax(CANIds.kLeftMotor2, MotorType.kBrushless);
        right1 = new CANSparkMax(CANIds.kRightMotor1, MotorType.kBrushless);
        right2 = new CANSparkMax(CANIds.kRightMotor2, MotorType.kBrushless);
    
        leftEncoder1 = left1.getEncoder();
        leftEncoder2 = left2.getEncoder();

        rightEncoder1 = right1.getEncoder();
        rightEncoder2 = right2.getEncoder();
    }


}
