package org.firstinspires.ftc.teamcode.tuning;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.MecanumDrive;
@Autonomous (name = "MockBlueLeftSide")
public final class MockBlueLeftSide extends LinearOpMode {

    public void runOpMode() throws InterruptedException {
        Pose2d beginPose = new Pose2d(0, 0, 0);
        if (TuningOpModes.DRIVE_CLASS.equals(MecanumDrive.class)) {
            MecanumDrive drive = new MecanumDrive(hardwareMap, beginPose);

            waitForStart();
            Actions.runBlocking(
                    drive.actionBuilder(beginPose)
                            //.splineToLinearHeading(new Pose2d(40,40,Math.toRadians(90)),Math.toRadians(45))
                            .strafeTo(new Vector2d(25,-5))
                            .strafeTo(new Vector2d(25, 35))
                            .splineToLinearHeading(new Pose2d(10, 40, Math.toRadians(225)), Math.toRadians(225))
                            .build());

//

        } else {
            throw new RuntimeException();
        }
    }
}
