// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

final class bov
    implements bwl
{

    final bou a;

    bov(bou bou)
    {
        a = bou;
        super();
    }

    public void a(Activity activity, Bundle bundle)
    {
        bpm bpm1 = bnk.a().s();
        if (bpm1 != null)
        {
            bpm1.a(bundle);
            geu geu1 = bpm1.q();
            if (geu1 != null)
            {
                geu1.a(bundle);
            }
            activity = dcn.e(((gqu)hlp.a(activity, gqu)).a());
            if (activity != null && g.c(activity))
            {
                bpm1.f("Triggering log upload for troubleshooting.");
            }
        }
    }
}
