// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ano
    implements gmz
{

    final ank a;

    ano(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "accounts_util_upgrade";
    }

    public void a(Context context, gmw gmw1)
    {
        String s = gmw1.b("account_name");
        Object obj;
        if ("SMS".equals(s))
        {
            obj = "smsmms";
        } else
        {
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "account-".concat(((String) (obj)));
            } else
            {
                obj = new String("account-");
            }
        }
        obj = context.getSharedPreferences(((String) (obj)), 0);
        if (obj != null)
        {
            Object obj1 = hgx.c(context, amo);
            context = ((SharedPreferences) (obj)).edit();
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((amo)((Iterator) (obj1)).next()).a(gmw1, ((SharedPreferences) (obj)), context)) { }
            context.apply();
            context = ((SharedPreferences) (obj)).getAll().entrySet().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                Object obj2 = (java.util.Map.Entry)context.next();
                String s1 = (String)((java.util.Map.Entry) (obj2)).getKey();
                obj2 = ((java.util.Map.Entry) (obj2)).getValue();
                if (obj2 instanceof String)
                {
                    gmw1.b(s1, (String)obj2);
                } else
                if (obj2 instanceof Boolean)
                {
                    gmw1.b(s1, g.a((Boolean)obj2, false));
                } else
                if (obj2 instanceof Integer)
                {
                    gmw1.b(s1, g.a((Integer)obj2, 0));
                } else
                if (obj2 instanceof Long)
                {
                    gmw1.b(s1, g.a((Long)obj2, 0L));
                } else
                if (obj2 instanceof Float)
                {
                    gmw1.b(s1, g.a((Float)obj2));
                } else
                if (obj2 instanceof Set)
                {
                    gmw1.a(s1, (Set)obj2);
                } else
                if (obj2 != null)
                {
                    obj2 = String.valueOf(obj2);
                    gbh.a((new StringBuilder(String.valueOf(obj2).length() + 29 + String.valueOf(s1).length())).append("Missed value type: ").append(((String) (obj2))).append(" for key: ").append(s1).toString());
                }
            } while (true);
            if (!"SMS".equals(s))
            {
                ((SharedPreferences) (obj)).edit().clear().apply();
                return;
            }
        }
    }
}
