// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class cvu
{

    private static final boolean a = false;

    public static ixl a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            ixl ixl1 = new ixl();
            ixl1.a = s;
            return ixl1;
        }
    }

    static jdk a(iwz iwz, boolean flag, String s, int i, int j, efu efu1)
    {
        return a(a(iwz, flag, s, i, efu1), j);
    }

    static jdk a(iwz iwz, boolean flag, String s, int i, efu efu1)
    {
        jdk jdk1 = new jdk();
        jdk1.a = efu1.e();
        long l = def.a();
        if (l != 0L || !TextUtils.isEmpty(s))
        {
            jdk1.b = new iwy();
            if (l != 0L)
            {
                jdk1.b.b = Long.toString(l);
                jdk1.b.c = Long.toString(l);
            }
            if (!TextUtils.isEmpty(s))
            {
                jdk1.b.a = s;
            }
        }
        if (iwz != null)
        {
            jdk1.c = iwz;
        }
        if (flag)
        {
            jdk1.d = Locale.getDefault().toString();
        }
        jdk1.f = Integer.valueOf(i);
        return jdk1;
    }

    static jdk a(String s, int i, int j, efu efu1)
    {
        return a(null, false, s, i, j, efu1);
    }

    static jdk a(jdk jdk1, int i)
    {
        if (i != -1 && dcz.m(i))
        {
            dcf dcf1 = new dcf(g.nU);
            long l = dcf1.a(i);
            long l1 = dcf1.b(i);
            if (l != -1L && l1 != -1L)
            {
                jdk1.i = new iwr();
                jdk1.i.c = Long.valueOf(l);
                jdk1.i.d = Long.valueOf(l1);
                return jdk1;
            }
        }
        return jdk1;
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
