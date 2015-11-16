// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class alf
    implements deu, gre
{

    final gqz a;

    alf(Context context)
    {
        a = (gqz)hlp.a(context, gqz);
    }

    public void a(Context context, grd grd1)
    {
    }

    public void a(grd grd1, cyw cyw1)
    {
        if (grd1.b("effective_gaia_id") != null && cyw1.n().m && !grd1.a("logged_out", false))
        {
            grd1.b("logged_in", true).b("logged_out", false);
            if (grd1.b("full_jid") == null)
            {
                g.a(new ali(this, a.b(grd1.b("account_name"), grd1.b("effective_gaia_id"))));
            }
        }
    }

    public void a(List list)
    {
        list.add(new alg(this));
        list.add(new alh(this));
    }
}
