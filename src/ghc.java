// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class ghc extends ghi
    implements gaw
{

    private volatile String e;

    public ghc(ggv ggv, ggl ggl)
    {
        super(ggv, a, new ghe(ggl), new ghd());
    }

    public jba a()
    {
        gbh.a(d);
        return (jba)b().get(e);
    }

    public void a(String s)
    {
        e = s;
    }
}
