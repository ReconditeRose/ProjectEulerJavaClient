package us.madelynolson.com.euler.javaclient;
public interface IProjectEulerJavaClient {

	public boolean isProblemSolved(int problemId);
	
	public int submitSolution(int problemId, String solution);
	
}
