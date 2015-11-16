// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hms extends hmi
{

    private final ad b;

    public hms(ad ad, hof hof)
    {
        super(hof, hmr);
        b = ad;
    }

    protected hmh a(Context context)
    {
        return new hmr(context);
    }

    protected void a(hmg hmg, hof hof, hlp hlp)
    {
        ((hmq)hmg).a(b, hof, hlp);
    }
}
