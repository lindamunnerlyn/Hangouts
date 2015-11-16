// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;

final class duz
    implements duv
{

    private Cursor a;
    private Cursor b;
    private dtj c;
    private dtj d;

    public duz(long l, long l1)
    {
        a = null;
        b = null;
        String as[];
        Context context;
        android.content.ContentResolver contentresolver;
        android.net.Uri uri;
        context = g.nU;
        contentresolver = context.getContentResolver();
        uri = dur.d();
        if (!due.g())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        as = dtn.a;
_L1:
        a = g.a(contentresolver, uri, as, dur.a(dur.a(), "date", l, l1), null, "date DESC");
        b = g.a(context.getContentResolver(), dur.e(), dtl.a, dur.a(dur.b(), "date", l / 1000L, (999L + l1) / 1000L), null, "date DESC");
        c = c();
        d = d();
        return;
        try
        {
            as = dtn.b;
        }
        catch (SQLiteException sqliteexception)
        {
            String s = String.valueOf(sqliteexception);
            eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 45)).append("SmsSyncManager.queryMms: failed to query mms ").append(s).toString(), sqliteexception);
            throw sqliteexception;
        }
          goto _L1
    }

    private dtj c()
    {
        if (a != null && a.moveToNext())
        {
            return dtn.a(a);
        } else
        {
            return null;
        }
    }

    private dtj d()
    {
        if (b != null && b.moveToNext())
        {
            return dtl.a(b);
        } else
        {
            return null;
        }
    }

    public dtj a()
    {
        if (c != null && d != null)
        {
            if (c.c() >= d.c())
            {
                dtj dtj1 = c;
                c = c();
                return dtj1;
            } else
            {
                dtj dtj2 = d;
                d = d();
                return dtj2;
            }
        }
        if (c != null)
        {
            dtj dtj3 = c;
            c = c();
            return dtj3;
        } else
        {
            dtj dtj4 = d;
            d = d();
            return dtj4;
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
