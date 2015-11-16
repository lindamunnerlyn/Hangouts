// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import java.io.InputStream;

public final class gfw
{

    final HttpResponse a;

    gfw(HttpResponse httpresponse)
    {
        a = httpresponse;
    }

    public InputStream a()
    {
        return a.getContent();
    }

    public String a(String s)
    {
        return a.getHeaders().getFirstHeaderStringValue(s);
    }
}
