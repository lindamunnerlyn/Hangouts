// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class dra
{

    private final gqz a;
    private final SharedPreferences b;

    dra(Context context)
    {
        a = (gqz)hlp.a(context, gqz);
        b = hkh.b(context);
    }

    public void a(int i, String s, String s1, long l)
    {
        if (i != -1)
        {
            a.b(i).c("LAST_CALL_LOCAL_SESSION", s).c("LAST_CALL_LOGS_PATH", s1).c("LAST_CALL_START_TIME", l).d();
        }
        b.edit().putString("LAST_CALL_LOCAL_SESSION", s).putString("LAST_CALL_LOGS_PATH", s1).putLong("LAST_CALL_START_TIME", l).apply();
    }

    public boolean a(int i)
    {
        return a.a(i).a("improve_hangouts_key", true);
    }

    public boolean a(int i, int j, long l)
    {
        Object obj;
        Object obj1;
        String s;
        long l1;
        boolean flag;
        long l2;
        if (i == -1)
        {
            obj1 = b.getString("THROTTLED_IMPRESSIONS", "");
        } else
        {
            obj1 = a.a(i).a("THROTTLED_IMPRESSIONS", "");
        }
        s = String.valueOf(j);
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L2; else goto _L1
_L1:
        obj = new JSONObject(((String) (obj1)));
        l1 = ((JSONObject) (obj)).optLong(s, -1L);
_L9:
        flag = false;
        l2 = System.currentTimeMillis() / 1000L;
        if (l1 != -1L && l1 >= l2) goto _L4; else goto _L3
_L3:
        flag = true;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new JSONObject();
            eev.c("Babel", String.format("JSON for throttles is created for account %s", new Object[] {
                Integer.valueOf(i)
            }));
        }
        l = l2 + l;
        ((JSONObject) (obj1)).put(s, l);
        if (i != -1) goto _L6; else goto _L5
_L5:
        b.edit().putString("THROTTLED_IMPRESSIONS", ((JSONObject) (obj1)).toString()).apply();
        return true;
        obj;
        obj = null;
_L7:
        eev.f("Babel", String.format("JSON for throttles: [[%s]] failed to parse", new Object[] {
            obj1
        }));
        l1 = -1L;
        continue; /* Loop/switch isn't completed */
_L6:
        a.b(i).c("THROTTLED_IMPRESSIONS", ((JSONObject) (obj1)).toString()).d();
        return true;
        obj;
        eev.g("Babel", String.format("JSON for throttles failed to put %d to %s", new Object[] {
            Long.valueOf(l), s
        }));
_L4:
        return flag;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L7; else goto _L2
_L2:
        obj = null;
        l1 = -1L;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void b(int i)
    {
        a.b(i).c("improve_hangouts_key", true).d();
    }

    public void c(int i)
    {
        if (i != -1)
        {
            a.b(i).h("THROTTLED_IMPRESSIONS").d();
        }
        b.edit().remove("THROTTLED_IMPRESSIONS").apply();
    }

    public String d(int i)
    {
        String s;
        String s1;
        if (i == -1)
        {
            s = "";
        } else
        {
            s = a.a(i).b("LAST_CALL_LOCAL_SESSION");
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = b.getString("LAST_CALL_LOCAL_SESSION", "");
        }
        return s1;
    }

    public String e(int i)
    {
        String s;
        String s1;
        if (i == -1)
        {
            s = "";
        } else
        {
            s = a.a(i).b("LAST_CALL_LOGS_PATH");
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = b.getString("LAST_CALL_LOGS_PATH", "");
        }
        return s1;
    }

    public long f(int i)
    {
        long l;
        long l1;
        if (i == -1)
        {
            l = -1L;
        } else
        {
            l = a.a(i).a("LAST_CALL_START_TIME", -1L);
        }
        l1 = l;
        if (l == -1L)
        {
            l1 = b.getLong("LAST_CALL_START_TIME", -1L);
        }
        return l1;
    }
}
