package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ColletorSubsystem extends SubsystemBase {
    VictorSP controller = new VictorSP(7);
    
    
    public ColletorSubsystem(){
        
    }

    public void colletor(double colletorSpeed){

        controller.set(colletorSpeed);

    }
}
