// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

final class dtq extends Thread
{

    final Context a;

    dtq(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        Configuration configuration = a.getResources().getConfiguration();
        int i = configuration.mcc;
        int j = configuration.mnc;
        eev.e("Babel_SMS", (new StringBuilder(43)).append("MmsConfig: mnc/mcc: ").append(i).append("/").append(j).toString());
        dtp.b(a);
    }
}
