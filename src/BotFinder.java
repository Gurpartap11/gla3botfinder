import java.util.List;

//ToDo class

public class BotFinder {


    /**
     * Create a bot finder with a set of accounts and tweets
     * @param accounts the list of account names
     * @param tweets List of each all tweets per account. tweets.get(i) contains
     *               all tweets for the account at accounts.get(i)
     */
    public BotFinder(List<String> accounts, List<String> tweets) {
    	//ToDo
    	    	
    	//calculate word frequency

    }

    /**
     * Find the frequency of use of a specific word by a specific account.
     * @param accountName name of account
     * @param word word to find the frequency of
     * @return the frequency of use for the word by the account
     */
    public double getAccountWordFrequency(String accountName, String word) {
    	//ToDo
    	
    	//calculate the frequency for every word for a specific account (user)
    	
        return 0.0;
    }

    /**
     * Find the similarity of two accounts based off their word use frequency
     * @param accountOne first account to analyze
     * @param accountTwo second account to analyze
     * @return a similarity score between -1 and 1, representing the account similarity
     */
    public double getAccountSimilarity(String accountOne, String accountTwo) {
    	//ToDo
    	
    	//Calculate similarity score between two accounts
    	
        return 0.0;
    }


    /**
     * Cleans a given string, removing punctuation and converting to lower case
     * @param rawString raw string
     * @return cleaned string
     */
    private static String cleanString(String rawString) {
        return rawString.replaceAll("\\W+", " ").toLowerCase();
    }
}
