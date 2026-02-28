package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TracaoSubsystem extends SubsystemBase {

    //Controladores e seus canais
    VictorSP controllerL = new VictorSP(2);
    VictorSP controllerR = new VictorSP(1);
    
    public DifferentialDrive motorGroup = new DifferentialDrive(controllerL, controllerR);

    public TracaoSubsystem (){

    }


    public void autonomousMove(double xSpeed, double zRotation){

        motorGroup.arcadeDrive(xSpeed, zRotation);

    }
    
    
}
