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

final class asv
    implements asd, fsn, hjt
{

    final Context a;
    ech b;
    private final ap c;
    private final String d = getClass().getName();
    private eci e;

    public asv(Context context, hjm hjm1, ap ap1)
    {
        e = new asw(this);
        a = context;
        c = ap1;
        hjm1.a(this);
    }

    private void a(boolean flag)
    {
        Object obj = c.a(d);
        bg bg1 = c.a();
        String s;
        ani ani1;
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
        obj = (ecj)hgx.a(a, ecj);
        s = a.getResources().getString(g.jO);
        ani1 = dbf.e(((gmo)hgx.a(a, gmo)).a());
        arraylist = new ArrayList();
        arraylist.add(new eck(a.getResources().getString(g.jH), ani.N(), g.jG));
        resources = a.getResources();
        if (ani1.ab())
        {
            i = g.jJ;
        } else
        {
            i = g.jI;
        }
        arraylist.add(new eck(resources.getString(i), ani1.B(), g.jG));
        b = ((ecj) (obj)).a(s, arraylist);
        b.a(e);
        b.a(bg1, d);
    }

    public void a(Bundle bundle)
    {
        a(false);
    }

    public void a(atd atd1, Collection collection)
    {
        ase ase1;
label0:
        {
            ase1 = (ase)hgx.a(a, ase);
            switch (asx.a[atd1.ordinal()])
            {
            default:
                atd1 = String.valueOf(atd1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(atd1).length() + 27)).append("Unknown conversation type: ").append(atd1).toString());

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ase1.a(1);
                return;

            case 4: // '\004'
                atd1 = dbf.e(((gmo)hgx.a(a, gmo)).a());
                break;
            }
            if (!atd1.S())
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
            } while (!ebz.j(((ais)iterator.next()).b().d));
            ase1.a(3);
            return;
        }
        if (collection.size() > 1 && !dbq.C(atd1.h()))
        {
            gbh.a("Account is not carrier SMS capable", atd1.t());
            ase1.a(3);
            return;
        }
        int i = atd1.T();
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
            g.a(atd1, 2511);
            a(true);
            return;
        } else
        {
            ase1.a(i);
            return;
        }
    }
}
