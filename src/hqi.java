// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.PrivateKey;
import java.util.Collection;

public final class hqi extends hpx
{

    String i;
    Collection j;
    PrivateKey k;
    String l;
    String m;

    public hqi()
    {
        super(hpu.a());
        b("https://accounts.google.com/o/oauth2/token");
    }

    private hqi b(String s)
    {
        return (hqi)super.a(s);
    }

    public hpx a(String s)
    {
        return b(s);
    }
}
