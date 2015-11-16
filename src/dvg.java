// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class dvg
{

    long a;
    String b;
    String c;
    String d;
    dvn e;
    private Context f;

    dvg(Context context)
    {
        a = TimeUnit.SECONDS.toMillis(3L);
        f = context;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public dvn d()
    {
        return e;
    }

    public long e()
    {
        if (f != null && eep.a(f))
        {
            return a * 10L;
        } else
        {
            return a;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dvg)
        {
            obj = (dvg)obj;
            flag = flag1;
            if (a == ((dvg) (obj)).a)
            {
                flag = flag1;
                if (TextUtils.equals(b, ((dvg) (obj)).b))
                {
                    flag = flag1;
                    if (TextUtils.equals(c, ((dvg) (obj)).c))
                    {
                        flag = flag1;
                        if (TextUtils.equals(d, ((dvg) (obj)).d))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        if (c != null)
        {
            j = c.hashCode();
        } else
        {
            j = 0;
        }
        if (d != null)
        {
            k = d.hashCode();
        } else
        {
            k = 0;
        }
        if (e != null)
        {
            l = e.hashCode();
        }
        return ((k + (j + (i + 2573) * 31) * 31) * 31 + l) * 31 + (int)(a ^ a >>> 32);
    }
}
