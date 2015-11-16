// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

final class pw extends rq
    implements px
{

    private final Activity a;

    public pw(Activity activity, Context context)
    {
        super(context);
        a = activity;
    }

    public void a(float f)
    {
        if (f != 1.0F) goto _L2; else goto _L1
_L1:
        b(true);
_L4:
        d(f);
        return;
_L2:
        if (f == 0.0F)
        {
            b(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
