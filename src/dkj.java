// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public final class dkj extends dgj
{

    private final ArrayList a;

    public dkj(aoa aoa, ArrayList arraylist)
    {
        super(aoa);
        a = arraylist;
    }

    public void a()
    {
        long l = eco.a();
        String s = def.c().f();
        if (TextUtils.isEmpty(s))
        {
            eev.f("Babel", "Unregister removed account with invalid gcm registration id");
        } else
        {
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                a(((dmf) (cwr.a(s, l, g.nU.getPackageName(), s1))));
            }
        }
    }
}
