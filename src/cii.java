// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

final class cii
    implements hce
{

    final cie a;

    cii(cie cie)
    {
        a = cie;
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
