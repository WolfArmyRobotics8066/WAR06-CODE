package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TracaoSubsystem;

public class TracaoCommand extends Command {

    TracaoSubsystem tracaoSubsystem;

    double speedLimiter;

    Supplier<Double> analogLeft, analogRight, gatilhoRight;
    
    public TracaoCommand(Supplier<Double> analogLeft, Supplier<Double> analogRight,Supplier<Double> gatilhoRight, TracaoSubsystem tracaoSubsystem){

        this.analogLeft = analogLeft;
        this.analogRight = analogRight;
        this.tracaoSubsystem = tracaoSubsystem;
        this.gatilhoRight = gatilhoRight;
        addRequirements(tracaoSubsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute(){
        if (gatilhoRight.get() > 0.5)
            speedLimiter = 1;
        else
            speedLimiter = 0.7;
        tracaoSubsystem.motorGroup.arcadeDrive(analogLeft.get() * speedLimiter, analogRight.get() * speedLimiter);
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
