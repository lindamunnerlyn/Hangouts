// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class clj
    implements Runnable
{

    final Context a;

    public clj(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        gbh.b();
        ani ani1 = dbf.a(a);
        if (ani1 == null)
        {
            return;
        }
        if ((new aoe(a, ani1.h())).O("DEBUG_RTCS") > 0L && a != null)
        {
            android.content.Intent intent = DebugActivity.b(a);
            a.startService(intent);
            return;
        }
        break MISSING_BLOCK_LABEL_80;
        Object obj;
        obj;
_L2:
        ebw.c("BabelDebugActivity", "account not found starting debug activity", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
