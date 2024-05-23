package org.sattelite.command;

import java.util.HashMap;
import java.util.Map;

public class TurnCommand implements PropertiesGetter{
	
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

	@Override
	public Map<String, Object> getPropertiesList() {
		Map<String,Object> props = new HashMap<String, Object>();
		props.put("CommandType", "TURN");
		props.put("TurnSpeed", turnSpeed);
		props.put("AnglePlaneX", anglePlaneX);
		props.put("AnglePlaneY", anglePlaneY);
		props.put("AnglePlaneZ", anglePlaneZ);
		return props;
	}

}
