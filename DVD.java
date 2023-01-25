public class DVD {

	// Fields:
	private String title;		// Title of this DVD
	private String rating;		// Rating of this DVD
	private int runningTime;	// Running time of this DVD in minutes
	
	public DVD() { //default constructor to initialize private variables
		this.dvdTitle = "";
		this.dvdRating = "";
		this.dvdRunningTime = 0;
	}
	
	public DVD(String dvdTitle, String dvdRating, int dvdRunningTime) 
	{
		//DVD Constructor
		this.dvdTitle = dvdTitle;
		this.dvdRating = dvdRating;
		this.dvdRunningTime = dvdRunningTime;
	}
	
	
	//getters -------------------------------------------
	public String getTitle() 
	{
		return this.dvdTitle;
	}
	
	public String getRating() 
	{
		return this.dvdRating;
	}
	
	public int getRunningTime() 
	{
		return this.dvdRunningTime;
	}

	
	//mutators -------------------------------------------
	public void setTitle(String newTitle) {
		this.dvdTitle = newTitle;
	}

	public void setRating(String newRating) {
		this.dvdRating = newRating;
	}

	public void setRunningTime(int newRunningTime) {
		this.dvdRunningTime = newRunningTime;
	}

	public String toString() {
		return dvdTitle + "/" + dvdRating + "/" + dvdRunningTime + "min";
	}
	
	
}
