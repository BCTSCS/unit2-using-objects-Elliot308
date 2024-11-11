public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private long numUsers;
    private GeoLocation geoLocation;
    public void fetchData(String api){
        String urlString=toString()+"/"+api;
        System.out.print(urlString);
    }
    public Website(){
        domain = "Google";
        topLevelDomain = "com";
        numUsers = 4_300_000_000L;
        geoLocation = new GeoLocation(41.2219,95.8608);
    }
    public Website(String domainName, String topDomainName){
        domain = domainName;
        topLevelDomain = topDomainName;
        numUsers = 0;
        geoLocation=new GeoLocation(40.935, -74.1176);
        
    }
    public Website(String domainName, String topDomainName, long numberUsers, GeoLocation g){
        domain = domainName;
        topLevelDomain = topDomainName;
        numUsers = numberUsers;
        geoLocation = g;
    }

    public GeoLocation getLocation(){
        return geoLocation;
    }
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://" + domain + "." + topLevelDomain; // + " has " + numUsers + " users";
        
        return res;
    }
    
    public static void main(String[] args)
    {
        //every variable is local
        //local variable use variable Type only 

        //Website web1 = new Website();
        //Website web2 = new Website("toyota", "com");
        //Website web3 = new Website("wikipedia", "org", 2738);
        
        //web1.toString();
        //web2.toString();
        //web3.toString();
       
        Website myWeb = new Website("ip-api", "com");
        myWeb.fetchData("json");
        
        Website Google = new Website();
        
        GeoLocation MicrosoftGeo = new GeoLocation(36.6646,78.3897);
        Website Microsoft = new Website("Microsoft","com", 1_000_000_000L, MicrosoftGeo);

        GeoLocation AmazonGeo = new GeoLocation(38.9339,77.1773);
        Website Amazon = new Website("Amazon","com", 1_000_000L, AmazonGeo);
        
        GeoLocation MetaGeo = new GeoLocation(44.2995,120.8346);
        Website Meta = new Website("Facebook","com", 3_200_000_000L, MetaGeo);

        //print geolocations of websites
        System.out.println(myWeb.getLocation());
        System.out.println(Google.getLocation());

        //find distance between websites

        //GOOGLE to MYWEB
        System.out.println("The distance between the two websites is: " + Google.getLocation().distanceFrom(myWeb.getLocation()));
        
        //GOOGLE to AMAZON
        System.out.println("The distance between the two websites is: " + Google.getLocation().distanceFrom(Amazon.getLocation()));
        
        //GOOGLE to META
        System.out.println("The distance between the two websites is: " + Google.getLocation().distanceFrom(Meta.getLocation()));
        
        //GOOGLE to MICROSOFT
        System.out.println("The distance between the two websites is: " + Google.getLocation().distanceFrom(Microsoft.getLocation()));
        
        //META to AMAZON
        System.out.println("The distance between the two websites is: " + Meta.getLocation().distanceFrom(Amazon.getLocation()));
        
        //META to MICROSOFT
        System.out.println("The distance between the two websites is: " + Meta.getLocation().distanceFrom(Microsoft.getLocation()));
    }
}
