// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class atk
    implements ass, hon, hoy
{

    final Context a;
    efj b;
    private final ap c;
    private final String d = getClass().getName();
    private efk e;

    public atk(Context context, hof hof1, ap ap1)
    {
        e = new atl(this);
        a = context;
        c = ap1;
        hof1.a(this);
    }

    private void a(boolean flag)
    {
        Object obj = c.a(d);
        bg bg1 = c.a();
        String s;
        aoa aoa1;
        ArrayList arraylist;
        Resources resources;
        int i;
        if (obj != null)
        {
            bg1.a(((ad) (obj)));
        } else
        if (!flag)
        {
            return;
        }
        obj = (efl)hlp.a(a, efl);
        s = a.getResources().getString(g.jG);
        aoa1 = dcn.e(((gqu)hlp.a(a, gqu)).a());
        arraylist = new ArrayList();
        arraylist.add(new efm(a.getResources().getString(g.jz), aoa.K(), g.jy));
        resources = a.getResources();
        if (aoa1.Y())
        {
            i = g.jB;
        } else
        {
            i = g.jA;
        }
        arraylist.add(new efm(resources.getString(i), aoa1.z(), g.jy));
        b = ((efl) (obj)).a(s, arraylist);
        b.a(e);
        b.a(bg1, d);
    }

    public void a(Bundle bundle)
    {
        a(false);
    }

    public void a(atu atu1, Collection collection)
    {
        ast ast1;
label0:
        {
            ast1 = (ast)hlp.a(a, ast);
            switch (atm.a[atu1.ordinal()])
            {
            default:
                atu1 = String.valueOf(atu1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(atu1).length() + 27)).append("Unknown conversation type: ").append(atu1).toString());

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ast1.a(1);
                return;

            case 4: // '\004'
                atu1 = dcn.e(((gqu)hlp.a(a, gqu)).a());
                break;
            }
            if (!atu1.P())
            {
                break label0;
            }
            Iterator iterator = collection.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!eey.j(((ail)iterator.next()).b().d));
            ast1.a(3);
            return;
        }
        if (collection.size() > 1 && !dcz.E(atu1.h()))
        {
            gdv.a("Account is not carrier SMS capable", atu1.r());
            ast1.a(3);
            return;
        }
        int i = atu1.Q();
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            g.a(atu1, 2511);
            a(true);
            return;
        } else
        {
            ast1.a(i);
            return;
        }
    }
}
