// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

public final class dvd
{

    private static final ContentValues n;
    private static final ContentValues o;
    private static final String p[] = {
        "1"
    };
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    private dvd(long l1, String s, String s1, int i1, int j1, String s2, 
            String s3, String s4, String s5, String s6, String s7, String s8, String s9)
    {
        a = l1;
        b = s;
        d = s1;
        f = i1;
        h = j1;
        i = s2;
        j = s3;
        k = s4;
        l = s5;
        s = s6;
        if (s6 == null)
        {
            s = "";
        }
        g = s;
        s = s7;
        if (s7 == null)
        {
            s = "";
        }
        e = s;
        s = s8;
        if (s8 == null)
        {
            s = "";
        }
        c = s;
        s = s9;
        if (s9 == null)
        {
            s = "";
        }
        m = s;
    }

    public dvd(String s, String s1, int i1)
    {
        this(-1L, s, s1, i1, -1, null, null, null, null, null, null, null, null);
    }

    public static dvd a(Cursor cursor, boolean flag)
    {
        if (cursor == null || !dvc.b(cursor.getString(0), "mms")) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        int i1;
        int j1;
        long l1 = -1L;
        if (flag)
        {
            l1 = cursor.getLong(4);
        }
        String s9 = cursor.getString(1);
        if (s9 != null)
        {
            s = s9.trim();
        } else
        {
            s = s9;
        }
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        String s11 = dvc.b(s);
        String s10 = cursor.getString(2);
        String s2;
        String s5;
        String s6;
        String s7;
        String s8;
        if (s10 != null)
        {
            s = s10.trim();
        } else
        {
            s = s10;
        }
        s2 = null;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_405;
        }
        s1 = dvc.b(s);
        s = s2;
        s2 = cursor.getString(3);
        if (s2 == null) goto _L4; else goto _L3
_L3:
        s = s2;
        i1 = Integer.parseInt(s2);
_L7:
        s = s1;
        s1 = s2;
_L5:
        j1 = 0;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        s2 = cursor.getString(5);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        j1 = Integer.parseInt(s2);
_L6:
        s2 = null;
        s5 = null;
        s6 = null;
        s7 = null;
        s8 = null;
        if (cursor.getColumnCount() >= 10)
        {
            s2 = cursor.getString(6);
            s5 = cursor.getString(7);
            s6 = cursor.getString(8);
            s7 = cursor.getString(9);
            s8 = cursor.getString(10);
        }
        return new dvd(l1, s11, s, i1, j1, s2, s5, s6, s7, s1, s10, s9, s8);
        Exception exception;
        exception;
        String s3 = String.valueOf(exception);
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s3).length() + 55)).append("TransactionSettings.Apn.fromCursor: invalid proxy port ").append(s3).toString());
        s3 = s;
        s = s1;
        i1 = -1;
        s1 = s3;
          goto _L5
        s3;
        String s4 = String.valueOf(s3);
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s4).length() + 58)).append("TransactionSettings.Apn.fromCursor: invalid current value ").append(s4).toString());
        j1 = 0;
          goto _L6
_L2:
        return null;
_L4:
        i1 = -1;
          goto _L7
        s1 = null;
        i1 = -1;
          goto _L5
    }

    public void a(Context context)
    {
        if (eev.a("Babel_SMS", 2))
        {
            long l1 = a;
            eev.b("Babel_SMS", (new StringBuilder(59)).append("TransactionSettings: set ").append(l1).append(" to be current").toString());
        }
        context = anh.a(context);
        context.beginTransaction();
        context.update("apn", n, "current =?", p);
        context.update("apn", o, "_id =?", new String[] {
            Long.toString(a)
        });
        context.setTransactionSuccessful();
        context.endTransaction();
        return;
        Exception exception;
        exception;
        context.endTransaction();
        throw exception;
    }

    public boolean a()
    {
        return !TextUtils.isEmpty(b);
    }

    public boolean b()
    {
        return !TextUtils.isEmpty(d);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("APN[");
        stringbuilder.append("rowId=").append(a).append("|");
        stringbuilder.append("mmsc=").append(b).append("|");
        stringbuilder.append("raw mmsc=").append(c).append("|");
        stringbuilder.append("proxy=").append(d).append("|");
        stringbuilder.append("raw proxy=").append(e).append("|");
        stringbuilder.append("port=").append(f).append("|");
        stringbuilder.append("raw port=").append(g).append("|");
        stringbuilder.append("numeric=").append(i).append("|");
        stringbuilder.append("name=").append(j).append("|");
        stringbuilder.append("mcc=").append(k).append("|");
        stringbuilder.append("mnc=").append(l).append("|");
        stringbuilder.append("raw apn").append(m).append("|");
        stringbuilder.append("current=").append(h).append("]");
        return stringbuilder.toString();
    }

    static 
    {
        ContentValues contentvalues = new ContentValues(1);
        n = contentvalues;
        contentvalues.putNull("current");
        contentvalues = new ContentValues(1);
        o = contentvalues;
        contentvalues.put("current", "1");
    }
}
