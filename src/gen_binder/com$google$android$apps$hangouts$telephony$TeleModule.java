// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dve;
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
            a = new HashMap(8);
            a.put(dve.a, Integer.valueOf(0));
            a.put(dve.b, Integer.valueOf(1));
            a.put(dve.c, Integer.valueOf(2));
            a.put(dve.d, Integer.valueOf(3));
            a.put(dve.e, Integer.valueOf(4));
            a.put(dve.f, Integer.valueOf(5));
            a.put(dve.g, Integer.valueOf(6));
            a.put(dve.h, Integer.valueOf(7));
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
            dve.a(hgx);
            return;

        case 1: // '\001'
            dve.a(context, hgx);
            return;

        case 2: // '\002'
            dve.b(context, hgx);
            return;

        case 3: // '\003'
            dve.b(hgx);
            return;

        case 4: // '\004'
            dve.c(context, hgx);
            return;

        case 5: // '\005'
            dve.c(hgx);
            return;

        case 6: // '\006'
            dve.d(context, hgx);
            return;

        case 7: // '\007'
            dve.d(hgx);
            break;
        }
    }

    public ()
    {
    }
}
