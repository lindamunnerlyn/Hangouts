// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public final class diw extends dfa
{

    private final ArrayList a;

    public diw(ani ani, ArrayList arraylist)
    {
        super(ani);
        a = arraylist;
    }

    public void a()
    {
        long l = dzk.a();
        String s = dcx.c().f();
        if (TextUtils.isEmpty(s))
        {
            ebw.f("Babel", "Unregister removed account with invalid gcm registration id");
        } else
        {
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (String)iterator.next();
                obj = cun.a(s, l, g.nS.getPackageName(), ((String) (obj)));
                c.a(((dko) (obj)));
            }
        }
    }
}
