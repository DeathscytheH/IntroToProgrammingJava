// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        // YOUR CODE HERE
        String s="";
        for (int i=0;i<longPost.length();i++){
            if(!"aeiouAEIOU".contains(longPost.substring(i,i+1))){
                s=s+longPost.substring(i,i+1);
            }            
        }
        return s;        
    }
}
