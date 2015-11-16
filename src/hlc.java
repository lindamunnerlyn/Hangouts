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

public class hlc
{

    final hlb a;
    HttpTransport b;
    JsonFactory c;
    GenericUrl d;
    hne e;
    HttpExecuteInterceptor f;
    HttpRequestInitializer g;
    Collection h;

    public hlc(hlb hlb1)
    {
        e = hne.a;
        h = new ArrayList();
        a = (hlb)h.b(hlb1);
    }

    public hlc a(String s)
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
