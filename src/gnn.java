// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gnn
    implements gmz
{

    final gnj a;

    gnn(gnj gnj)
    {
        a = gnj;
        super();
    }

    public String a()
    {
        return "add_effective_gaia_id";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.d("is_managed_account"))
        {
            gmw1.b("effective_gaia_id", gmw1.b("gaia_id"));
        }
    }
}
