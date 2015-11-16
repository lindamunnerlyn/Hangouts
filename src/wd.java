// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class wd
    implements tq
{

    final vw a;

    wd(vw vw1)
    {
        a = vw1;
        super();
    }

    public void a(ta ta1, boolean flag)
    {
        if (ta1 instanceof tu)
        {
            ((tu)ta1).r().a(false);
        }
        tq tq1 = a.a();
        if (tq1 != null)
        {
            tq1.a(ta1, flag);
        }
    }

    public boolean a(ta ta1)
    {
        if (ta1 == null)
        {
            return false;
        }
        a.l = ((tu)ta1).getItem().getItemId();
        tq tq1 = a.a();
        if (tq1 != null)
        {
            return tq1.a(ta1);
        } else
        {
            return false;
        }
    }
}
