// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.PrivateKey;
import java.util.Collection;

public final class hln extends hlc
{

    String i;
    Collection j;
    PrivateKey k;
    String l;
    String m;

    public hln()
    {
        super(hkz.a());
        b("https://accounts.google.com/o/oauth2/token");
    }

    private hln b(String s)
    {
        return (hln)super.a(s);
    }

    public hlc a(String s)
    {
        return b(s);
    }
}
