// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public final class hmb
{

    final Proxy a;

    public hmb()
    {
        this((byte)0);
    }

    private hmb(byte byte0)
    {
        a = null;
    }

    public HttpURLConnection a(URL url)
    {
        if (a == null)
        {
            url = url.openConnection();
        } else
        {
            url = url.openConnection(a);
        }
        return (HttpURLConnection)url;
    }
}
