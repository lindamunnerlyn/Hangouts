// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

final class fcj
    implements HostnameVerifier
{

    final fci a;

    fcj(fci fci)
    {
        a = fci;
        super();
    }

    public boolean verify(String s, SSLSession sslsession)
    {
        HostnameVerifier hostnameverifier = HttpsURLConnection.getDefaultHostnameVerifier();
        if (hostnameverifier.verify(s, sslsession))
        {
            return true;
        }
        if ("android.clients.google.com".equalsIgnoreCase(s))
        {
            return hostnameverifier.verify("clients.google.com", sslsession);
        } else
        {
            return false;
        }
    }
}
