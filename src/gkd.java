// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class gkd extends gkj
    implements gdk
{

    private volatile String f;

    public gkd(gjw gjw, gjl gjl)
    {
        super(gjw, a, new gkf(gjl), new gke());
    }

    public jhh a()
    {
        gdv.a("Expected condition to be true", e);
        return (jhh)b().get(f);
    }

    public void a(String s)
    {
        f = s;
    }
}
