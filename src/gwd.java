// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gwd
{

    private static final long a;
    private static final long b;
    private static final long c;
    private gwe d;
    private gwa e;
    private gwa f;

    public gwd(Context context)
    {
        d = (new gwg()).a(context);
        e = (new gwb()).a("media").a(a).b(b).a(0.1F).a();
        f = (new gwb()).a("media_sync").a(0L).b(c).a(0.25F).a();
    }

    public gwc a()
    {
        return new gwc(d, e, f);
    }

    static 
    {
        a = hkp.c.a(5L);
        b = hkp.c.a(100L);
        c = hkp.c.a(512L);
    }
}
