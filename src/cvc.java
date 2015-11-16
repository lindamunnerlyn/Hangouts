// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class cvc extends Enum
{

    public static final cvc a;
    public static final cvc b;
    public static final cvc c;
    public static final cvc d;
    public static final cvc e;
    public static final cvc f;
    private static final cvc m[] = values();
    private static final cvc o[];
    public final long g;
    public final long h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    private final dbc n;

    private cvc(String s, int i1, int j1, long l1, long l2, 
            dbc dbc1, String s1, String s2)
    {
        super(s, i1);
        i = j1;
        g = TimeUnit.MINUTES.toMillis(l1);
        h = TimeUnit.MINUTES.toMillis(l2);
        n = dbc1;
        k = s1;
        l = s2;
        i1 = ordinal();
        gdv.a("Ordinals should always be >= 0.  If the ordinal has exceeded 31, then the type of fieldMask must be bumped from an int => long.", i1, 0, 31);
        j = 1 << i1;
    }

    public static void a(int i1, Collection collection)
    {
        cvc acvc[] = m;
        int k1 = acvc.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            cvc cvc1 = acvc[j1];
            if (cvc1.a(i1))
            {
                collection.add(Integer.valueOf(cvc1.i));
            }
        }

    }

    private static boolean a(long l1, long l2, long l3)
    {
        return l1 >= l2 - l3 && l1 <= l2 || l3 == 0L;
    }

    public static String[] a()
    {
        String as[] = new String[m.length << 1];
        for (int i1 = 0; i1 < m.length; i1++)
        {
            cvc cvc1 = m[i1];
            int j1 = i1 << 1;
            as[j1] = cvc1.k;
            as[j1 + 1] = cvc1.l;
        }

        return as;
    }

    public static cvc valueOf(String s)
    {
        return (cvc)Enum.valueOf(cvc, s);
    }

    public static cvc[] values()
    {
        return (cvc[])o.clone();
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
        if (cursor.isNull(i1))
        {
            return null;
        } else
        {
            return n.a(cursor, i1);
        }
    }

    public boolean b(long l1, long l2)
    {
        return a(l1, l2, g);
    }

    static 
    {
        a = new cvc("REACHABLE", 0, 1, 0L, 30L, dbc.a, "reachable", "reachable_time");
        b = new cvc("AVAILABLE", 1, 2, 5L, 1L, dbc.a, "available", "available_time");
        c = new cvc("STATUS_MESSAGE", 2, 3, 0L, 1L, dbc.d, "status_message", "status_message_time");
        d = new cvc("CALL_TYPE", 3, 6, 5L, 1L, dbc.b, "call_type", "call_type_time");
        e = new cvc("DEVICE_STATUS", 4, 7, 5L, 1L, dbc.b, "device_status", "device_status_time");
        f = new cvc("LAST_SEEN", 5, 10, 0L, 1L, dbc.c, "last_seen", "last_seen_time");
        o = (new cvc[] {
            a, b, c, d, e, f
        });
    }
}
