// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;

final class alm
{

    private final ber a = (new bes()).a("callpromos").b("Module that hosts the call promos.").a(true).a();

    public alm()
    {
    }

    public all a(Context context)
    {
        return (all)a.a(context, new alq());
    }

    public ber[] a()
    {
        return (new ber[] {
            a
        });
    }

    public ctf[] b(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new alp());
        arraylist.add(new als());
        return (ctf[])a.a(context, ctf, arraylist);
    }
}
