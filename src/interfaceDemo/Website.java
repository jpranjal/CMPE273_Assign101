package interfaceDemo;

public interface Website extends Wall, Profile, Friends {
	public boolean isFast();
	public boolean hasGoodUI();
	public boolean isSafe();
	public boolean noVulgarityAllowed();
	public boolean hasWordCensoring();
	
}
