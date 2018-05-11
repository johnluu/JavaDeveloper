package qofd.SystemInterfaces;

public interface UserWatchingDAOI {

	public boolean watch(boolean iswatching, int userid, int questionid);
	public boolean istWatching(int userid, int questionid);
	
}