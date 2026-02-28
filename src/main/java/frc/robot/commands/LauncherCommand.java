package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LauncherSubsystem;

public class LauncherCommand extends Command{
    LauncherSubsystem launcherSubsystem;
    double launcherSpeed;

    public LauncherCommand(LauncherSubsystem launcherSubsystem, double launcherSpeed){

        this.launcherSubsystem = launcherSubsystem;
        this.launcherSpeed = launcherSpeed;
        addRequirements(launcherSubsystem);
    }
    
    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
       launcherSubsystem.launcher(launcherSpeed);
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
