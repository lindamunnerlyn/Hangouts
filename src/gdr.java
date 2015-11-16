// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class gdr extends BroadcastReceiver
{

    final gdq a;
    private boolean b;
    private int c;

    public gdr(gdq gdq)
    {
        a = gdq;
        super();
        b = true;
        c = -1;
    }

    public boolean a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public void onReceive(Context context, Intent intent)
    {
        int i;
        int j;
        boolean flag;
        if (intent.getIntExtra("plugged", 0) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        i = intent.getIntExtra("scale", 0);
        j = intent.getIntExtra("level", 0);
        if (i != 0)
        {
            c = (j * 100) / i;
            return;
        } else
        {
            c = -1;
            return;
        }
    }
}
