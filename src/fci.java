// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Network;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class fci
    implements Closeable
{

    public int a;
    public int b;
    public SSLSocketFactory c;
    private Context d;
    private HostnameVerifier e;
    private fck f;

    public fci(Context context, boolean flag)
    {
        Object obj1 = null;
        super();
        a = 60000;
        b = 60000;
        d = context;
        f = new fck(d);
        Object obj;
        if (flag)
        {
            obj = a();
        } else
        {
            obj = null;
        }
        c = ((SSLSocketFactory) (obj));
        if (c == null)
        {
            obj = obj1;
            if (context != null)
            {
                obj = obj1;
                if (android.os.Build.VERSION.SDK_INT > 18)
                {
                    obj = new SSLSessionCache(context);
                }
            }
            c = SSLCertificateSocketFactory.getDefault(60000, ((SSLSessionCache) (obj)));
        }
        e = new fcj(this);
    }

    private SSLSocketFactory a()
    {
        Object obj;
        try
        {
            obj = ejn.d(d);
        }
        catch (Exception exception)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        obj = (SSLSocketFactory)((Context) (obj)).getClassLoader().loadClass("com.google.android.gms.common.net.SSLCertificateSocketFactory").getMethod("getDefaultWithSessionCache", new Class[] {
            Integer.TYPE, android/content/Context
        }).invoke(null, new Object[] {
            Integer.valueOf(60000), d
        });
        return ((SSLSocketFactory) (obj));
    }

    public HttpURLConnection a(URL url, Network network)
    {
label0:
        {
            h.a(url);
            Object obj = f.a(url.toString());
            network = url;
            if (obj == null)
            {
                break label0;
            }
            if (((Bundle) (obj)).getString("block") != null)
            {
                (new StringBuilder("Blocked by ")).append(((Bundle) (obj)).getString("name")).append(": ").append(url);
                throw new cby(((Bundle) (obj)));
            }
            obj = ((Bundle) (obj)).getString("rewrite");
            network = url;
            if (obj == null)
            {
                break label0;
            }
            if (!URLUtil.isHttpUrl(((String) (obj))))
            {
                network = url;
                if (!URLUtil.isHttpsUrl(((String) (obj))))
                {
                    break label0;
                }
            }
            if (Log.isLoggable("GoogleURLConnFactory", 3))
            {
                (new StringBuilder("Rewrote ")).append(url.toString()).append(" to ").append(((String) (obj)));
            }
            network = new URL(((String) (obj)));
        }
        url = network.openConnection();
        url.setConnectTimeout(b);
        url.setReadTimeout(a);
        if (url instanceof HttpsURLConnection)
        {
            if (c != null)
            {
                ((HttpsURLConnection)url).setSSLSocketFactory(c);
            }
            if (e != null)
            {
                ((HttpsURLConnection)url).setHostnameVerifier(e);
            }
        }
        return (HttpURLConnection)url;
    }

    void a(String s, int i)
    {
        f.a(s, i);
    }

    public void close()
    {
    }
}
