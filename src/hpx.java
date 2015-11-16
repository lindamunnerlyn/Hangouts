// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import java.util.ArrayList;
import java.util.Collection;

public class hpx
{

    final hpw a;
    HttpTransport b;
    JsonFactory c;
    GenericUrl d;
    hsa e;
    HttpExecuteInterceptor f;
    HttpRequestInitializer g;
    Collection h;

    public hpx(hpw hpw1)
    {
        e = hsa.a;
        h = new ArrayList();
        a = (hpw)h.a(hpw1);
    }

    public hpx a(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new GenericUrl(s);
        }
        d = s;
        return this;
    }
}
