// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class dtn extends dtj
{

    public static final String a[] = {
        "_id", "type", "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent"
    };
    public static final String b[] = {
        "_id", "type", "address", "body", "date", "thread_id", "status", "read", "seen"
    };
    public static final int c = 0;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    private static int w;
    public String m;
    public String n;
    public long o;
    public long p;
    public long q;
    public int r;
    public long s;
    public int t;
    public boolean u;
    public boolean v;

    public dtn()
    {
    }

    public static dtn a(Cursor cursor)
    {
        boolean flag1 = false;
        dtn dtn1 = new dtn();
        dtn1.o = cursor.getLong(c);
        dtn1.m = cursor.getString(e);
        dtn1.n = cursor.getString(f);
        dtn1.p = cursor.getLong(g) * 1000L;
        long l1;
        boolean flag;
        if (due.g())
        {
            l1 = cursor.getLong(l) * 1000L;
        } else
        {
            l1 = 0L;
        }
        dtn1.q = l1;
        dtn1.r = cursor.getInt(d);
        dtn1.s = cursor.getLong(h);
        dtn1.t = cursor.getInt(i);
        if (cursor.getInt(j) == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        dtn1.u = flag;
        if (cursor.getInt(k) == 0)
        {
            flag = flag1;
        } else
        {
            flag = true;
        }
        dtn1.v = flag;
        return dtn1;
    }

    public int a()
    {
        return 0;
    }

    public long b()
    {
        return o;
    }

    public long c()
    {
        return p;
    }

    static 
    {
        w = 0;
        w = 1;
        int i1 = w;
        w = i1 + 1;
        d = i1;
        i1 = w;
        w = i1 + 1;
        e = i1;
        i1 = w;
        w = i1 + 1;
        f = i1;
        i1 = w;
        w = i1 + 1;
        g = i1;
        i1 = w;
        w = i1 + 1;
        h = i1;
        i1 = w;
        w = i1 + 1;
        i = i1;
        i1 = w;
        w = i1 + 1;
        j = i1;
        i1 = w;
        w = i1 + 1;
        k = i1;
        i1 = w;
        w = i1 + 1;
        l = i1;
    }
}
