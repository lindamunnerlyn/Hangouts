// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import chq;
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
            a.put(chq.a, Integer.valueOf(0));
            a.put(chq.b, Integer.valueOf(1));
            a.put(chq.c, Integer.valueOf(2));
            a.put(chq.d, Integer.valueOf(3));
            a.put(chq.e, Integer.valueOf(4));
            a.put(chq.f, Integer.valueOf(5));
        }
        context = (Integer)a.get(class1.getName());
        if (context == null)
        {
            return;
        }
        switch (context.intValue())
        {
        default:
            return;

        case 0: // '\0'
            chq.a(hgx);
            return;

        case 1: // '\001'
            chq.b(hgx);
            return;

        case 2: // '\002'
            chq.c(hgx);
            return;

        case 3: // '\003'
            chq.d(hgx);
            return;

        case 4: // '\004'
            chq.e(hgx);
            return;

        case 5: // '\005'
            chq.f(hgx);
            break;
        }
    }

    public ()
    {
    }
}
