// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class bwl
    implements bwg, gxq
{

    private final Context a;
    private final SharedPreferences b;

    bwl(Context context)
    {
        a = context;
        b = context.getSharedPreferences("interaction_prefs", 0);
    }

    private void a(int i, int j)
    {
        String s = b(i);
        s = (new StringBuilder(String.valueOf(s).length() + 29)).append(s).append("logged_impression_").append(j).toString();
        if (!b.getBoolean(s, false))
        {
            g.a(dbf.e(i), j);
            b.edit().putBoolean(s, true).apply();
        }
    }

    private static String b(int i)
    {
        return (new StringBuilder(20)).append("account_").append(i).append("_").toString();
    }

    private static String c(int i)
    {
        return String.valueOf(b(i)).concat("login_time");
    }

    public void a(int i)
    {
        Object obj = ((gms)hgx.a(a, gms)).a(i);
        if (((gmu) (obj)).b())
        {
            if (!((gmu) (obj)).d("sms_only"))
            {
                obj = b.edit();
                ((android.content.SharedPreferences.Editor) (obj)).remove(c(i));
                String s = b(i);
                Iterator iterator = b.getAll().keySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)iterator.next();
                    if (s1.startsWith(s))
                    {
                        ((android.content.SharedPreferences.Editor) (obj)).remove(s1);
                    }
                } while (true);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
        } else
        if (((gmu) (obj)).a() && !b.contains(c(i)))
        {
            gsi gsi1 = (gsi)hgx.a(a, gsi);
            b.edit().putLong(c(i), gsi1.a()).apply();
            a(i, 2590);
            return;
        }
    }

    public void a(int i, bwh bwh1)
    {
        lcx lcx1 = new lcx(b.getLong(c(i), 0L));
        lcx lcx2 = new lcx(((gsi)hgx.a(a, gsi)).a());
        if (lcx2.b(lcx1.a(1)))
        {
            a(i, 2591);
            a(i, bwh1.d);
        }
        if (lcx2.b(lcx1.a(7)))
        {
            a(i, 2595);
            a(i, bwh1.e);
        }
    }
}
