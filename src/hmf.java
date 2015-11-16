// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class hmf extends HttpTransport
{

    private static final String a[];
    private final hmb b;
    private final SSLSocketFactory c;
    private final HostnameVerifier d;

    public hmf()
    {
        this((byte)0);
    }

    private hmf(byte byte0)
    {
        b = new hmb();
        c = null;
        d = null;
    }

    protected LowLevelHttpRequest buildRequest(String s, String s1)
    {
        l.a(supportsMethod(s), "HTTP method %s not supported", new Object[] {
            s
        });
        s1 = new URL(s1);
        s1 = b.a(s1);
        s1.setRequestMethod(s);
        if (s1 instanceof HttpsURLConnection)
        {
            s = (HttpsURLConnection)s1;
            if (d != null)
            {
                s.setHostnameVerifier(d);
            }
            if (c != null)
            {
                s.setSSLSocketFactory(c);
            }
        }
        return new hmc(s1);
    }

    public boolean supportsMethod(String s)
    {
        return Arrays.binarySearch(a, s) >= 0;
    }

    static 
    {
        String as[] = new String[7];
        as[0] = "DELETE";
        as[1] = "GET";
        as[2] = "HEAD";
        as[3] = "OPTIONS";
        as[4] = "POST";
        as[5] = "PUT";
        as[6] = "TRACE";
        a = as;
        Arrays.sort(as);
    }
}
