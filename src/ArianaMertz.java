public class ArianaMertz {
	String firstName;
	String lastName;
	String fullName;
	String uciNetID;
	String studentNumber;
	
	public ArianaMertz()
	{
		firstName = "Ariana";
		lastName = "Mertz";
		fullName = firstName + " " + lastName;
		uciNetID = "amertz";
		studentNumber = "11849339";
	}
	
	String getFullName()
	{
		return fullName;
	}
	
	String getFirstName()
	{
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	String getUCInetID() {
		return uciNetID;
	}
	
	String getRotatedFullName(int shift) {
		if (shift == 0)
			return fullName;
		else if (shift>0)
		{
			return fullName.substring(shift) + fullName.substring(0,shift);
		}
		else
		{
			return fullName.substring(fullName.length() + shift) 
					+ fullName.substring(0,fullName.length() + shift);
		}
	}
}
