package smartcity.accessibility.socialnetwork;

import smartcity.accessibility.mapmanagement.Location;
import smartcity.accessibility.search.SearchQuery;
/**
 * @author Kolikant
 *
 */
public class AuthenticatedUser implements User {
	String name;
	String password;
	
	String getUserName() {
		return null;
	}

	String setUserName() {
		return null;
	}

	void setPassword() {

	}

	void getPassword() {

	}

	void addReview(Location __, String Review) {

	}
	
	/*
	 * make a search using an existing query and show the user the results
	 */
	void search(SearchQuery �){
		�.Search().showResults();
	}
}