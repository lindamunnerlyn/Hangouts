// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

public final class der
    implements deu
{

    final ArrayList a;
    final Context b;

    public der(ArrayList arraylist, Context context)
    {
        a = arraylist;
        b = context;
        super();
    }

    public void a(daf daf1, aim aim)
    {
    }

    public void a(daf daf1, ais ais1)
    {
        String s = ais1.d();
        String s1 = ais1.g();
        if (!TextUtils.isEmpty(daf1.a))
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
            s2 = daf1.a;
            s3 = daf1.b;
            s4 = daf1.d;
            if (TextUtils.isEmpty(s))
            {
                daf1 = daf1.e;
            } else
            {
                daf1 = s;
            }
            daf1 = g.a(s2, s3, null, s4, s, ((String) (obj)), daf1, s1, null, null);
            daf1.C = ais1.l();
            daf1.B = ais1.j();
            daf1.A = ais1.k();
            a.add(daf1);
            return;
        } else
        {
            a.add(g.a(b, daf1.d, s, s1));
            return;
        }
    }
}
