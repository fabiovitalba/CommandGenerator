package org.sattelite.command;

@CommandType("MOVE-FORWARD")
public class ForwardCommand {
    private String power;
    private int time;
    private String secretCode;

    public ForwardCommand(String power, int time, String secretCode) {
        this.power = power;
        this.time = time;
        this.secretCode = secretCode;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @IgnoreInSerialization
    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }
}
