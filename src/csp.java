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

final class csp
    implements ctu
{

    private static final Handler c = new Handler(Looper.getMainLooper());
    public final String a;
    public cuz b;
    private int d;
    private final List e = new ArrayList();

    public csp(String s)
    {
        a = s;
    }

    static List a(csp csp1)
    {
        return csp1.e;
    }

    private void a(int i)
    {
        c.post(new csq(this, i));
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
            for (i = 0; iterator.hasNext(); i = ((csr)iterator.next()).a | i) { }
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

    public int a(dba dba, int i)
    {
        i = b.a(dba, i);
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

    boolean a(csv csv1)
    {
        for (int i = e.size() - 1; i >= 0; i--)
        {
            if (((csr)e.get(i)).b == csv1)
            {
                e.remove(i);
            }
        }

        return !e.isEmpty();
    }

    boolean a(csv csv1, int i)
    {
        boolean flag = true;
        csr csr1 = new csr(csv1, i);
        e.add(csr1);
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
            csv1.a(b);
        }
        if (flag && d != 0)
        {
            d = 0;
        }
        return flag;
    }

    public boolean a(cvc cvc1, Object obj, long l)
    {
        boolean flag = b.a(cvc1, obj, l);
        if (flag)
        {
            a(cvc1.j);
        }
        return flag;
    }

}
