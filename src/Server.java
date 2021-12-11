import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
    
    public String Reverse (String s1)
    {
        String s2 ="";
        char ch;
        for (int i=0; i< s1.length(); i++)
        {
            ch= s1.charAt(i);
            s2= ch+s2 ;
        }
      return s2;
    }

    @Override
    public char minChar(String s1)
    {
        char c =s1.charAt(0);
        for (int i=1; i<s1.length(); i++)
        {
            if(s1.charAt(i) < c)
            {
                c=s1.charAt(i);
            }
        }
        return c;
    }
    public String upperLower ( String s1)
    {
        String s2 ="";
        for (int i = 0; i <s1.length() ; i++) {
        if (s1.charAt(i)>='a'&& s1.charAt(i)<='z')
        {
            s2=s2+(char)(s1.charAt(i)-32);
        }
        else if  (s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
        {
            s2=s2+(char)(s1.charAt(i)+32);
        }
        else {
            s2=s2+(char)(s1.charAt(i));
        }
        }
        return s2;
    }
}
