// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ConnectException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class adg extends DefaultClientConnectionOperator
{

    private static final PlainSocketFactory a = new PlainSocketFactory();
    private final boolean b;

    public adg(SchemeRegistry schemeregistry, boolean flag)
    {
        super(schemeregistry);
        b = flag;
    }

    private ArrayList a(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = InetAddress.getAllByName(s);
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = s[i];
            if (b && (obj instanceof Inet6Address))
            {
                arraylist.add(obj);
            } else
            if (!b && (obj instanceof Inet4Address))
            {
                arraylist.add(obj);
            }
            i++;
        }
        return arraylist;
    }

    public void openConnection(OperatedClientConnection operatedclientconnection, HttpHost httphost, InetAddress inetaddress, HttpContext httpcontext, HttpParams httpparams)
    {
        if (operatedclientconnection == null)
        {
            throw new IllegalArgumentException("Connection must not be null.");
        }
        if (httphost == null)
        {
            throw new IllegalArgumentException("Target host must not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (operatedclientconnection.isOpen())
        {
            throw new IllegalArgumentException("Connection must not be open.");
        }
        Scheme scheme = schemeRegistry.getScheme(httphost.getSchemeName());
        SocketFactory socketfactory = scheme.getSocketFactory();
        Object obj;
        LayeredSocketFactory layeredsocketfactory;
        java.net.Socket socket;
        Object obj1;
        java.net.Socket socket1;
        java.net.Socket socket2;
        ArrayList arraylist;
        int i;
        if (socketfactory instanceof LayeredSocketFactory)
        {
            obj = a;
            layeredsocketfactory = (LayeredSocketFactory)socketfactory;
        } else
        {
            layeredsocketfactory = null;
            obj = socketfactory;
        }
        arraylist = a(httphost.getHostName());
        i = 0;
        if (i >= arraylist.size()) goto _L2; else goto _L1
_L1:
        socket1 = ((SocketFactory) (obj)).createSocket();
        operatedclientconnection.opening(socket1, httphost);
        socket2 = ((SocketFactory) (obj)).connectSocket(socket1, ((InetAddress)arraylist.get(i)).getHostAddress(), scheme.resolvePort(httphost.getPort()), inetaddress, 0, httpparams);
        socket = socket1;
        if (socket1 == socket2)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        operatedclientconnection.opening(socket2, httphost);
        socket = socket2;
        prepareSocket(socket, httpcontext, httpparams);
        if (layeredsocketfactory == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        socket1 = layeredsocketfactory.createSocket(socket, httphost.getHostName(), scheme.resolvePort(httphost.getPort()), true);
        if (socket1 == socket)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        operatedclientconnection.opening(socket1, httphost);
        operatedclientconnection.openCompleted(socketfactory.isSecure(socket1), httpparams);
        return;
        try
        {
            operatedclientconnection.openCompleted(socketfactory.isSecure(socket), httpparams);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (i != arraylist.size() - 1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (obj1 instanceof ConnectException)
            {
                operatedclientconnection = (ConnectException)obj1;
            } else
            {
                operatedclientconnection = (ConnectException)(new ConnectException(((SocketException) (obj1)).getMessage())).initCause(((Throwable) (obj1)));
            }
            throw new HttpHostConnectException(httphost, operatedclientconnection);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (i == arraylist.size() - 1)
            {
                throw obj1;
            }
        }
        i++;
        break MISSING_BLOCK_LABEL_115;
_L2:
    }

}
