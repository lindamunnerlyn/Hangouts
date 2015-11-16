// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;

final class ale
    implements coz
{

    private dbx a;
    private ai b;
    private int c;
    private String d;
    private ala e;

    ale()
    {
    }

    static ai a(ale ale1)
    {
        return ale1.b;
    }

    static void a(ale ale1, dbx dbx1, jhb jhb1)
    {
        boolean flag;
        if (!ebz.c(dbx1.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "If CallerId is blocked, CallerId settings should never be loaded");
        if (jhb1.b() && !((ajo)jhb1.c()).a())
        {
            Object obj = (ajo)jhb1.c();
            dbx1 = ale1.b;
            jhb1 = ale1.e;
            dbx dbx2 = ale1.a;
            int i = ale1.c;
            ale1 = ale1.d;
            String s = ebz.g();
            obj = ((ajo) (obj)).c();
            if (!TextUtils.isEmpty(s))
            {
                flag = ((String) (obj)).equals(s);
            } else
            {
                flag = false;
            }
            ale1 = (new android.app.AlertDialog.Builder(dbx1)).setTitle(g.iN).setNegativeButton(g.iK, new ajw(dbx2, i, ale1, jhb1, dbx1));
            if (flag)
            {
                ale1.setMessage(g.iL).setPositiveButton(g.iO, new ajx(dbx1, i));
            } else
            {
                ale1.setMessage(dbx1.getString(g.iM, new Object[] {
                    ebz.o(((String) (obj)))
                }));
            }
            ale1.create().show();
            return;
        }
        dbx1.a(jhb1);
        if (jhb1.b())
        {
            ale1.e.a(2249);
        }
        ale1.b.startActivity(dbx1.a(ale1.c, ale1.d));
        ale1.b.finish();
    }

    static dbx b(ale ale1)
    {
        return ale1.a;
    }

    public void a(ai ai1, dbx dbx1, int i, String s)
    {
        e = new ala(ai1, i);
        b = ai1;
        a = dbx1;
        c = i;
        d = s;
        b.f().b(1, null, new alf(this)).u();
    }
}
