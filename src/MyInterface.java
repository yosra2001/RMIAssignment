import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
  public String Reverse(String s1) throws RemoteException;
    public char minChar(String s1) throws RemoteException;
    public String upperLower(String s1) throws RemoteException;
}
}
