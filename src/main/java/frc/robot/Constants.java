package frc.robot;

import edu.wpi.first.math.util.Units;

public class Constants {
    public static class CANIds {
        public final static int kRightMotor1 = 20;
        public final static int kRightMotor2 = 21;
        public final static int kLeftMotor1 = 30;
        public final static int kLeftMotor2 = 31;
    }

    public static class DriveConstants {
        public static final double kTrackWidth = 0.381 * 2; // meters
        public static final double kWheelRadius = Units.inchesToMeters(3);
        public static final double kGearRatio = 1/10.71;
        public static final double kDistancePerPulse = kGearRatio * 2 * Math.PI * kWheelRadius;
    }
}
