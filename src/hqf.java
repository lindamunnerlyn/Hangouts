// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;

public final class hqf
    implements HttpExecuteInterceptor, HttpRequestInitializer
{

    private final boolean a;

    public hqf()
    {
        this((byte)0);
    }

    private hqf(byte byte0)
    {
        a = false;
    }

    public void initialize(HttpRequest httprequest)
    {
        httprequest.setInterceptor(this);
    }

    public void intercept(HttpRequest httprequest)
    {
        String s;
        boolean flag1;
        flag1 = true;
        s = httprequest.getRequestMethod();
        if (s.equals("POST")) goto _L2; else goto _L1
_L1:
        if (!s.equals("GET")) goto _L4; else goto _L3
_L3:
        if (httprequest.getUrl().build().length() <= 2048) goto _L6; else goto _L5
_L5:
        boolean flag = flag1;
_L13:
        if (!flag) goto _L8; else goto _L7
_L7:
        s = httprequest.getRequestMethod();
        httprequest.setRequestMethod("POST");
        httprequest.getHeaders().set("X-HTTP-Method-Override", s);
        if (!s.equals("GET")) goto _L10; else goto _L9
_L9:
        httprequest.setContent(new UrlEncodedContent(httprequest.getUrl().clone()));
        httprequest.getUrl().clear();
_L8:
        return;
_L4:
        flag = flag1;
        if (a)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = flag1;
        if (!httprequest.getTransport().supportsMethod(s))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L10:
        if (httprequest.getContent() != null) goto _L8; else goto _L11
_L11:
        httprequest.setContent(new EmptyContent());
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
