// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

final class cjo
    implements hgv
{

    final cjk a;

    cjo(cjk cjk)
    {
        a = cjk;
        super();
    }

    public int a(Context context, String s)
    {
        return context.checkSelfPermission(s);
    }

    public void a(Activity activity, String as[], int i)
    {
        activity.requestPermissions(as, i);
    }
}
