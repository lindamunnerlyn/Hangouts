// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.List;

public final class cer extends cqv
{

    public cer()
    {
    }

    public cqw a()
    {
        return new cep();
    }

    public boolean a(Context context)
    {
        chz chz1;
        Iterator iterator;
        chz1 = (chz)hgx.a(context, chz);
        iterator = cep.a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (chz1.a((String)iterator.next())) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        return flag && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("contacts_rationale_shown", false);
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int b()
    {
        return crb.f;
    }

    public int c()
    {
        return g.ne;
    }
}
