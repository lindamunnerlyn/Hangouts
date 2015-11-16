// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

public final class dga
    implements dgd
{

    final ArrayList a;
    final Context b;

    public dga(ArrayList arraylist, Context context)
    {
        a = arraylist;
        b = context;
        super();
    }

    public void a(dbl dbl1, aif aif)
    {
    }

    public void a(dbl dbl1, ail ail1)
    {
        String s = ail1.d();
        String s1 = ail1.g();
        if (!TextUtils.isEmpty(dbl1.a))
        {
            Object obj;
            String s2;
            String s3;
            String s4;
            if (s == null)
            {
                obj = null;
            } else
            {
                obj = s.split(" ");
                if (obj.length > 0)
                {
                    obj = obj[0];
                } else
                {
                    obj = s;
                }
            }
            s2 = dbl1.a;
            s3 = dbl1.b;
            s4 = dbl1.d;
            if (TextUtils.isEmpty(s))
            {
                dbl1 = dbl1.e;
            } else
            {
                dbl1 = s;
            }
            dbl1 = g.a(s2, s3, null, s4, s, ((String) (obj)), dbl1, s1, null, null);
            dbl1.C = ail1.l();
            dbl1.B = ail1.j();
            dbl1.A = ail1.k();
            a.add(dbl1);
            return;
        } else
        {
            a.add(g.a(b, dbl1.d, s, s1));
            return;
        }
    }
}
