// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class agp extends HttpEntityEnclosingRequestBase
{

    public agp()
    {
    }

    public agp(String s)
    {
        setURI(URI.create(s));
    }

    public String getMethod()
    {
        return "PATCH";
    }
}
