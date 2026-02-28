package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherSubsystem extends SubsystemBase {
    VictorSP controller = new VictorSP(4);

    public LauncherSubsystem(){
        
    }

    public void launcher(double launcherSpeed){

        controller.set(launcherSpeed);

    }
}
