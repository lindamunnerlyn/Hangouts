// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gyl;
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
            a = new HashMap(7);
            a.put(gyl.a, Integer.valueOf(0));
            a.put(gyl.b, Integer.valueOf(1));
            a.put(gyl.c, Integer.valueOf(2));
            a.put(gyl.d, Integer.valueOf(3));
            a.put(gyl.e, Integer.valueOf(4));
            a.put(gyl.f, Integer.valueOf(5));
            a.put(gyl.g, Integer.valueOf(6));
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
            gyl.a(hgx);
            return;

        case 1: // '\001'
            gyl.a(context, hgx);
            return;

        case 2: // '\002'
            gyl.b(hgx);
            return;

        case 3: // '\003'
            gyl.b(context, hgx);
            return;

        case 4: // '\004'
            gyl.c(hgx);
            return;

        case 5: // '\005'
            gyl.c(context, hgx);
            return;

        case 6: // '\006'
            gyl.d(hgx);
            break;
        }
    }

    public ()
    {
    }
}
