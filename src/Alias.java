import java.security.Key;

public class Alias
{
    private String id;
    private String key;
//    private Key key;

    public Alias(String id, String key)
    {
        this.id = id;
        this.key = key;
    }
    public Alias(String id)
    {
        this.id = id;
    }

    String getAlias(){
        return String.format("%s : %s", id, key);
    }

}