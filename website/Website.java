public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    
    public Website(){
        domain = "example";
        topLevelDomain = "com";
        numUsers = 0;
    }
    public Website(String domainName, String topDomainName){
        domain = domainName;
        topLevelDomain = topDomainName;
        numUsers = 0;
        
    }
    public Website(String domainName, String topDomainName, int numberUsers){
        domain = domainName;
        topLevelDomain = topDomainName;
        numUsers = numberUsers;
        
    }
    
    
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain + " has " + numUsers + " users";
        
        return res;
    }
    
    public static void main(String[] args)
    {
        //Website web1 = new Website();
        //Website web2 = new Website("toyota", "com");
        //Website web3 = new Website("wikipedia", "org", 2738);
        
        //web1.toString();
        //web2.toString();
        //web3.toString();
    }
}
