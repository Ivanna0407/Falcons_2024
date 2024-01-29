// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Chasis_Sub extends SubsystemBase {
  /** Creates a new Chasis_Sub. */
  private final TalonFX Right_Motor_M = new TalonFX(1);
  private final TalonFX Right_Motor_S = new TalonFX(2);
  private final TalonFX Left_Motor_M = new TalonFX(3);
  private final TalonFX Left_Motor_S = new TalonFX(4);
  public Chasis_Sub() {
    Right_Motor_M.setNeutralMode(NeutralModeValue.Brake);
    //Right_Motor_S.setNeutralMode(NeutralModeValue.Brake);
    //Left_Motor_M.setNeutralMode(NeutralModeValue.Brake);
    //Left_Motor_S.setNeutralMode(NeutralModeValue.Brake);

    //Left_Motor_M.setInverted(true);
    //Left_Motor_S.setInverted(true);

    //Left_Motor_M.set(0);
    //Left_Motor_S.set(0);
    Right_Motor_M.set(0);
    //Right_Motor_S.set(0);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void setspeed(double right_speed,double left_speed){
    if (Math.abs(left_speed)>= 0.8){left_speed=(left_speed/Math.abs(left_speed))*0.8;}
    if (Math.abs(right_speed)>= 0.8){right_speed=(right_speed/Math.abs(right_speed))*0.8;}

    //Left_Motor_M.set(left_speed);Left_Motor_S.set(left_speed);
    Right_Motor_M.set(right_speed);//Right_Motor_S.set(right_speed);
  }
}