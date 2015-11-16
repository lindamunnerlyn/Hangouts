// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class bxd
    implements bwz, hcb
{

    private final Context a;
    private final SharedPreferences b;

    bxd(Context context)
    {
        a = context;
        b = context.getSharedPreferences("interaction_prefs", 0);
    }

    private void a(int i, int j)
    {
        String s = String.valueOf(b(i));
        s = (new StringBuilder(String.valueOf(s).length() + 29)).append(s).append("logged_impression_").append(j).toString();
        if (!b.getBoolean(s, false))
        {
            g.a(dcn.e(i), j);
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
        Object obj = ((gqz)hlp.a(a, gqz)).a(i);
        if (((grb) (obj)).b())
        {
            if (!((grb) (obj)).d("sms_only"))
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
        if (((grb) (obj)).a() && !b.contains(c(i)))
        {
            gwu gwu1 = (gwu)hlp.a(a, gwu);
            b.edit().putLong(c(i), gwu1.a()).apply();
            a(i, 2590);
            return;
        }
    }

    public void a(int i, bxa bxa1)
    {
        long l = b.getLong(c(i), 0L);
        long l1 = ((gwu)hlp.a(a, gwu)).a();
        if (l1 < TimeUnit.MILLISECONDS.convert(1L, TimeUnit.DAYS) + l)
        {
            a(i, 2591);
            a(i, bxa1.d);
        }
        if (l1 < l + TimeUnit.MILLISECONDS.convert(7L, TimeUnit.DAYS))
        {
            a(i, 2595);
            a(i, bxa1.e);
        }
    }
}
