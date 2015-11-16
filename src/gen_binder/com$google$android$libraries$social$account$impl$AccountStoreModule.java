// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import god;
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
            a = new HashMap(6);
            a.put(god.a, Integer.valueOf(0));
            a.put(god.b, Integer.valueOf(1));
            a.put(god.c, Integer.valueOf(2));
            a.put(god.d, Integer.valueOf(3));
            a.put(god.e, Integer.valueOf(4));
            a.put(god.f, Integer.valueOf(5));
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
            god.a(hgx);
            return;

        case 1: // '\001'
            god.a(context, hgx);
            return;

        case 2: // '\002'
            god.b(context, hgx);
            return;

        case 3: // '\003'
            god.c(context, hgx);
            return;

        case 4: // '\004'
            god.b(hgx);
            return;

        case 5: // '\005'
            god.c(hgx);
            break;
        }
    }

    public ()
    {
    }
}
