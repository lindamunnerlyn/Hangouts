// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;

final class dsg
    implements dsc
{

    private Cursor a;
    private Cursor b;
    private dqp c;
    private dqp d;

    public dsg(long l, long l1)
    {
        a = null;
        b = null;
        String as[];
        Context context;
        android.content.ContentResolver contentresolver;
        android.net.Uri uri;
        context = g.nS;
        contentresolver = context.getContentResolver();
        uri = dry.d();
        if (!drk.g())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        as = dqt.a;
_L1:
        a = g.a(contentresolver, uri, as, dry.a(dry.a(), "date", l, l1), null, "date DESC");
        b = g.a(context.getContentResolver(), dry.e(), dqr.a, dry.a(dry.b(), "date", l / 1000L, (999L + l1) / 1000L), null, "date DESC");
        c = c();
        d = d();
        return;
        try
        {
            as = dqt.b;
        }
        catch (SQLiteException sqliteexception)
        {
            String s = String.valueOf(sqliteexception);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 45)).append("SmsSyncManager.queryMms: failed to query mms ").append(s).toString(), sqliteexception);
            throw sqliteexception;
        }
          goto _L1
    }

    private dqp c()
    {
        if (a != null && a.moveToNext())
        {
            return dqt.a(a);
        } else
        {
            return null;
        }
    }

    private dqp d()
    {
        if (b != null && b.moveToNext())
        {
            return dqr.a(b);
        } else
        {
            return null;
        }
    }

    public dqp a()
    {
        if (c != null && d != null)
        {
            if (c.c() >= d.c())
            {
                dqp dqp1 = c;
                c = c();
                return dqp1;
            } else
            {
                dqp dqp2 = d;
                d = d();
                return dqp2;
            }
        }
        if (c != null)
        {
            dqp dqp3 = c;
            c = c();
            return dqp3;
        } else
        {
            dqp dqp4 = d;
            d = d();
            return dqp4;
        }
    }

    public void b()
    {
        if (a != null)
        {
            a.close();
            a = null;
        }
        if (b != null)
        {
            b.close();
            b = null;
        }
    }
}
