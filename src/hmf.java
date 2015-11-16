// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

public final class hmf extends hmi
{

    private final Activity b;

    public hmf(Activity activity, hof hof)
    {
        super(hof, hme);
        b = activity;
    }

    protected hmh a(Context context)
    {
        return new hme(context);
    }

    protected void a(hmg hmg, hof hof, hlp hlp)
    {
        ((hmd)hmg).a(b, hof, hlp);
    }
}
