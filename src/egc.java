// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

final class egc
    implements Runnable
{

    final egb a;

    egc(egb egb1)
    {
        a = egb1;
        super();
    }

    public void run()
    {
        if (a.e == 1 || a.e == 2 || a.e == 3)
        {
            Toast.makeText(a.c, a.c.getString(l.u), 0).show();
            a.j();
            a.d = null;
        }
    }
}
