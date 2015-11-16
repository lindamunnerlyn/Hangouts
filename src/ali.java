// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class ali
    implements ddm, gmx
{

    private final gms a;

    ali(Context context)
    {
        a = (gms)hgx.a(context, gms);
    }

    static gms a(ali ali1)
    {
        return ali1.a;
    }

    public void a(Context context, gmw gmw1)
    {
    }

    public void a(gmw gmw1, cws cws1)
    {
        if (gmw1.b("effective_gaia_id") != null && cws1.n().m && !gmw1.a("logged_out", false))
        {
            gmw1.b("logged_in", true).b("logged_out", false);
            if (gmw1.b("full_jid") == null)
            {
                g.a(new all(this, a.b(gmw1.b("account_name"), gmw1.b("effective_gaia_id"))));
            }
        }
    }

    public void a(List list)
    {
        list.add(new alj(this));
        list.add(new alk(this));
    }
}
