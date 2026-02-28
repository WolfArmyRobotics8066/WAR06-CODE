package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ColletorSubsystem;

public class ColletorCommand extends Command{
    ColletorSubsystem colletorSubsystem;
    double colletorSpeed;

    public ColletorCommand(ColletorSubsystem colletorSubsystem, double colletorSpeed){

        this.colletorSubsystem = colletorSubsystem;
        this.colletorSpeed = colletorSpeed;
        addRequirements(colletorSubsystem);
    }
    
    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
       colletorSubsystem.colletor(colletorSpeed);
    }
    
    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
