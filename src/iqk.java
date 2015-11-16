// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.util.Map;

public final class iqk
    implements joj
{

    private final joj a;
    private final joj b;
    private final joj c;
    private final joj d;
    private final joj e;

    public iqk(joj joj1, joj joj2, joj joj3, joj joj4, joj joj5)
    {
        a = joj1;
        b = joj2;
        c = joj3;
        d = joj4;
        e = joj5;
    }

    public Object a()
    {
        Activity activity = (Activity)a.a();
        hof hof1 = (hof)b.a();
        Object obj = (Map)c.a();
        joj joj1 = d;
        joj joj2 = e;
        obj = (joj)((Map) (obj)).get(activity.getClass().getName());
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "Activity %s has not been configured for accounts", new Object[] {
            activity
        });
        obj = (Class)((joj) (obj)).a();
        if (obj == hbd)
        {
            return new hbd((ai)activity, hof1, (gqz)joj1.a(), (hbk)joj2.a(), hbs.a);
        }
        if (obj == grn)
        {
            return new grn(activity, hof1, (gqz)joj1.a(), gqy.a);
        } else
        {
            String s = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 34)).append("Unexpected account handler class: ").append(s).toString());
        }
    }
}
