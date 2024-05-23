package org.sattelite.command;

@CommandType("TURN")
public class TurnCommand {
	
	private String turnSpeed;
	private int anglePlaneX;
	private int anglePlaneY;
	private int anglePlaneZ;
	
	public TurnCommand(String turnSpeed, int anglePlaneX, int anglePlaneY, int anglePlaneZ) {
		this.turnSpeed = turnSpeed;
		this.anglePlaneX = anglePlaneX;
		this.anglePlaneY = anglePlaneY;
		this.anglePlaneZ = anglePlaneZ;
	}

	public String getTurnSpeed() {
		return turnSpeed;
	}

	public int getAnglePlaneX() {
		return anglePlaneX;
	}

	public int getAnglePlaneY() {
		return anglePlaneY;
	}

	public int getAnglePlaneZ() {
		return anglePlaneZ;
	}

}
