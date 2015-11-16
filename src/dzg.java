// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class dzg
    implements crk
{

    private static final Handler c = new Handler(Looper.getMainLooper());
    public final String a;
    public csw b;
    private int d;
    private final List e = new ArrayList();

    public dzg(String s)
    {
        a = s;
    }

    static List a(dzg dzg1)
    {
        return dzg1.e;
    }

    private void a(int i)
    {
        c.post(new dzh(this, i));
    }

    int a(long l)
    {
        boolean flag;
        if (l <= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || d == 0)
        {
            Iterator iterator = e.iterator();
            int i;
            for (i = 0; iterator.hasNext(); i = ((dzi)iterator.next()).a | i) { }
            if (flag || b == null || !b.a(i, l))
            {
                return i;
            }
        }
        return 0;
    }

    public int a(Cursor cursor)
    {
        int i = b.a(cursor);
        if (i != 0)
        {
            a(i);
        }
        return i;
    }

    public int a(czu czu, int i)
    {
        i = b.a(czu, i);
        if (i != 0)
        {
            a(i);
        }
        return i;
    }

    public void a(int i, ContentValues contentvalues)
    {
        if (b != null)
        {
            b.a(i, contentvalues);
        }
    }

    void a(int i, boolean flag)
    {
        if (flag)
        {
            d = i;
        } else
        if (d == i)
        {
            d = 0;
            return;
        }
    }

    public boolean a(csz csz1, Object obj, long l)
    {
        boolean flag = b.a(csz1, obj, l);
        if (flag)
        {
            a(csz1.j);
        }
        return flag;
    }

    boolean a(ebc ebc1)
    {
        for (int i = e.size() - 1; i >= 0; i--)
        {
            if (((dzi)e.get(i)).b == ebc1)
            {
                e.remove(i);
            }
        }

        return !e.isEmpty();
    }

    boolean a(ebc ebc1, int i)
    {
        boolean flag = true;
        dzi dzi1 = new dzi(ebc1, i);
        e.add(dzi1);
        long l = SystemClock.elapsedRealtime();
        if (b != null)
        {
            int j = b.b(i, l);
            if (!b.a(i, l))
            {
                i = j;
            } else
            {
                flag = false;
                i = j;
            }
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            ebc1.a(b);
        }
        if (flag && d != 0)
        {
            d = 0;
        }
        return flag;
    }

}
