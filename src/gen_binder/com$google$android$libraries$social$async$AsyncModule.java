// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gqm;
import hgx;
import hhe;
import java.util.HashMap;

public final class 
    implements hhe
{

    private HashMap a;

    public void a(Context context, Class class1, hgx hgx)
    {
        if (a == null)
        {
            a = new HashMap(5);
            a.put(gqm.a, Integer.valueOf(0));
            a.put(gqm.b, Integer.valueOf(1));
            a.put(gqm.c, Integer.valueOf(2));
            a.put(gqm.d, Integer.valueOf(3));
            a.put(gqm.e, Integer.valueOf(4));
        }
        class1 = (Integer)a.get(class1.getName());
        if (class1 == null)
        {
            return;
        }
        switch (class1.intValue())
        {
        default:
            return;

        case 0: // '\0'
            gqm.a(hgx);
            return;

        case 1: // '\001'
            gqm.a(context, hgx);
            return;

        case 2: // '\002'
            gqm.b(context, hgx);
            return;

        case 3: // '\003'
            gqm.b(hgx);
            return;

        case 4: // '\004'
            gqm.c(context, hgx);
            break;
        }
    }

    public ()
    {
    }
}
