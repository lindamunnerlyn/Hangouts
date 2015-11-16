// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class ctq
{

    private static final boolean a = false;

    public static irg a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            irg irg1 = new irg();
            irg1.a = s;
            return irg1;
        }
    }

    static ixf a(iqu iqu, boolean flag, String s, int i, int j, ecs ecs1)
    {
        return a(a(iqu, flag, s, i, ecs1), j);
    }

    static ixf a(iqu iqu, boolean flag, String s, int i, ecs ecs1)
    {
        ixf ixf1 = new ixf();
        ixf1.a = ecs1.e();
        long l = dcx.a();
        if (l != 0L || !TextUtils.isEmpty(s))
        {
            ixf1.b = new iqt();
            if (l != 0L)
            {
                ixf1.b.b = Long.toString(l);
                ixf1.b.c = Long.toString(l);
            }
            if (!TextUtils.isEmpty(s))
            {
                ixf1.b.a = s;
            }
        }
        if (iqu != null)
        {
            ixf1.c = iqu;
        }
        if (flag)
        {
            ixf1.d = Locale.getDefault().toString();
        }
        ixf1.f = Integer.valueOf(i);
        return ixf1;
    }

    static ixf a(ixf ixf1, int i)
    {
        if (i != -1 && dbq.j(i))
        {
            daz daz1 = new daz(g.nS);
            long l = daz1.a(i);
            long l1 = daz1.b(i);
            if (l != -1L && l1 != -1L)
            {
                ixf1.i = new iqm();
                ixf1.i.c = Long.valueOf(l);
                ixf1.i.d = Long.valueOf(l1);
                return ixf1;
            }
        }
        return ixf1;
    }

    static ixf a(String s, int i, int j, ecs ecs1)
    {
        return a(null, false, s, i, j, ecs1);
    }

    static 
    {
        hik hik = ebw.k;
    }
}
