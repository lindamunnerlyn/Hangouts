// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class csz extends Enum
{

    public static final csz a;
    public static final csz b;
    public static final csz c;
    public static final csz d;
    public static final csz e;
    public static final csz f;
    private static final csz m[] = values();
    private static final csz o[];
    public final long g;
    public final long h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    private final czw n;

    private csz(String s, int i1, int j1, long l1, long l2, 
            czw czw1, String s1, String s2)
    {
        super(s, i1);
        i = j1;
        g = TimeUnit.MINUTES.toMillis(l1);
        h = TimeUnit.MINUTES.toMillis(l2);
        n = czw1;
        k = s1;
        l = s2;
        i1 = ordinal();
        gbh.a("Ordinals should always be >= 0.  If the ordinal has exceeded 31, then the type of fieldMask must be bumped from an int => long.", i1, 0, 31);
        j = 1 << i1;
    }

    public static void a(int i1, Collection collection)
    {
        csz acsz[] = m;
        int k1 = acsz.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            csz csz1 = acsz[j1];
            if (csz1.a(i1))
            {
                collection.add(Integer.valueOf(csz1.i));
            }
        }

    }

    private static boolean a(long l1, long l2, long l3)
    {
        return l1 >= l2 - l3 && l1 <= l2 || l3 == 0L;
    }

    public static String[] a()
    {
        ArrayList arraylist = new ArrayList(m.length * 2);
        Object aobj[] = m;
        int j1 = aobj.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            csz csz1 = aobj[i1];
            arraylist.add(csz1.k);
            arraylist.add(csz1.l);
        }

        aobj = new String[arraylist.size()];
        arraylist.toArray(aobj);
        return ((String []) (aobj));
    }

    public static csz valueOf(String s)
    {
        return (csz)Enum.valueOf(csz, s);
    }

    public static csz[] values()
    {
        return (csz[])o.clone();
    }

    public long a(Cursor cursor)
    {
        return cursor.getLong(ordinal() * 2 + 1);
    }

    public void a(Object obj, long l1, long l2, ContentValues contentvalues)
    {
        if (b(l1, l2))
        {
            n.a(k, obj, contentvalues);
            contentvalues.put(l, Long.valueOf(l1));
        }
    }

    public boolean a(int i1)
    {
        return (j & i1) != 0;
    }

    public boolean a(long l1, long l2)
    {
        return a(l1, l2, h);
    }

    public Object b(Cursor cursor)
    {
        int i1 = ordinal() * 2;
        if (!cursor.isNull(i1))
        {
            return n.a(cursor, i1);
        } else
        {
            return null;
        }
    }

    public boolean b(long l1, long l2)
    {
        return a(l1, l2, g);
    }

    static 
    {
        a = new csz("REACHABLE", 0, 1, 0L, 30L, czw.a, "reachable", "reachable_time");
        b = new csz("AVAILABLE", 1, 2, 5L, 1L, czw.a, "available", "available_time");
        c = new csz("STATUS_MESSAGE", 2, 3, 0L, 1L, czw.d, "status_message", "status_message_time");
        d = new csz("CALL_TYPE", 3, 6, 5L, 1L, czw.b, "call_type", "call_type_time");
        e = new csz("DEVICE_STATUS", 4, 7, 5L, 1L, czw.b, "device_status", "device_status_time");
        f = new csz("LAST_SEEN", 5, 10, 0L, 1L, czw.c, "last_seen", "last_seen_time");
        o = (new csz[] {
            a, b, c, d, e, f
        });
    }
}
