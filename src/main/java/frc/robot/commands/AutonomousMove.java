package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TracaoSubsystem;

//
public class AutonomousMove extends Command {

    TracaoSubsystem tracaoSubsystem;
    double tracaoSpeed;
    double tracaoRotation;
    
    // Recebo o subsistema e valor de velocidade e rotacao
    public AutonomousMove(TracaoSubsystem tracaoSubsystem, double tracaoSpeed, double tracaoRotation){

        this.tracaoSubsystem = tracaoSubsystem;
        this.tracaoSpeed = tracaoSpeed;
        this.tracaoRotation = tracaoRotation;
        addRequirements(tracaoSubsystem);

    }

    @Override
    public void execute() {
        tracaoSubsystem.autonomousMove(tracaoSpeed, tracaoRotation);
    }
}
