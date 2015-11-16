// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import bwk;
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
            a = new HashMap(4);
            a.put(bwk.a, Integer.valueOf(0));
            a.put(bwk.b, Integer.valueOf(1));
            a.put(bwk.c, Integer.valueOf(2));
            a.put(bwk.d, Integer.valueOf(3));
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
            bwk.a(context, hgx);
            return;

        case 1: // '\001'
            bwk.b(context, hgx);
            return;

        case 2: // '\002'
            bwk.c(context, hgx);
            return;

        case 3: // '\003'
            bwk.d(context, hgx);
            break;
        }
    }

    public ()
    {
    }
}
