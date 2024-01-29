// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Chasis_Sub;
import java.util.function.Supplier;

public class Chasis_move_cmd extends Command {
  /** Creates a new Chasis_move_cmd. */
  private final Chasis_Sub chasis;
  private final Supplier<Double> RT,LT;
  public Chasis_move_cmd(Chasis_Sub chasis_Sub,Supplier<Double>RT,Supplier<Double>LT) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.chasis=chasis_Sub;
    this.LT=LT;
    this.RT=RT;
    addRequirements(chasis_Sub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed=LT.get()-RT.get(); if (Math.abs(speed)<.15){speed=0;}
    chasis.setspeed(speed, speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
