// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gvk;
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
            a.put(gvk.a, Integer.valueOf(0));
            a.put(gvk.b, Integer.valueOf(1));
            a.put(gvk.c, Integer.valueOf(2));
            a.put(gvk.d, Integer.valueOf(3));
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
            gvk.a(context, hgx);
            return;

        case 1: // '\001'
            gvk.a(hgx);
            return;

        case 2: // '\002'
            gvk.b(hgx);
            return;

        case 3: // '\003'
            gvk.c(hgx);
            break;
        }
    }

    public ()
    {
    }
}