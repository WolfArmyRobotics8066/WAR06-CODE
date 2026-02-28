package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.ColletorSubsystem;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.subsystems.TracaoSubsystem;





public class AutonomousCommandF extends SequentialCommandGroup {
    

    public AutonomousCommandF (TracaoSubsystem tracaoSubsystem, LauncherSubsystem launcherSubsystem, ColletorSubsystem colletorSubsystem){

        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, -0.7, 0), new WaitCommand(0.6)));
        addCommands(new ParallelRaceGroup(new LauncherCommand(launcherSubsystem,0.7)), new WaitCommand(1.5));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0, -0.7)), new WaitCommand(1));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0.7, 0), new ColletorCommand(colletorSubsystem, 0.7)), new WaitCommand(5.5));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, -0.7, 0)), new WaitCommand(5.5));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0, 0.7)), new WaitCommand(1));
        addCommands(new ParallelRaceGroup(new LauncherCommand(launcherSubsystem,0.7)), new WaitCommand(1.5));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0, 0.7)), new WaitCommand(0.75));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0.7, 0)), new WaitCommand(6));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0, -0.7)), new WaitCommand(0.75));
        addCommands(new ParallelRaceGroup(new AutonomousMove(tracaoSubsystem, 0.7, 0)), new WaitCommand(6));

    }
}
