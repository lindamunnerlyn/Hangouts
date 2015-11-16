// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.net.NetworkInfo;
import android.widget.Toast;

final class akk
    implements hjw
{

    final ajl a;
    final AlertDialog b;
    final akf c;

    akk(akf akf1, ajl ajl1, AlertDialog alertdialog)
    {
        c = akf1;
        a = ajl1;
        b = alertdialog;
        super();
    }

    public boolean a()
    {
        boolean flag = false;
        if (c.a == null || c.a.isEmpty() || !c.a.equals(a.c()))
        {
            b.show();
        } else
        {
            akf akf1 = c;
            if (akf1.h == null || !akf1.h.isConnected())
            {
                Toast.makeText(akf1.b, akf1.b.getString(g.iN), 0).show();
            } else
            {
                flag = true;
            }
            if (flag)
            {
                c.a(a.c());
                return true;
            }
        }
        return true;
    }
}
