// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import fzq;
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
            a.put(fzq.a, Integer.valueOf(0));
            a.put(fzq.b, Integer.valueOf(1));
            a.put(fzq.c, Integer.valueOf(2));
            a.put(fzq.d, Integer.valueOf(3));
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
            fzq.a(hgx);
            return;

        case 1: // '\001'
            fzq.b(hgx);
            return;

        case 2: // '\002'
            fzq.c(hgx);
            return;

        case 3: // '\003'
            fzq.d(hgx);
            break;
        }
    }

    public ()
    {
    }
}
