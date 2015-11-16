// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gak;
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
            a = new HashMap(3);
            a.put(gak.a, Integer.valueOf(0));
            a.put(gak.b, Integer.valueOf(1));
            a.put(gak.c, Integer.valueOf(2));
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
            gak.a(context, hgx);
            return;

        case 1: // '\001'
            gak.a(hgx);
            return;

        case 2: // '\002'
            gak.b(hgx);
            break;
        }
    }

    public ()
    {
    }
}
