// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class ciq
{

    ciq()
    {
    }

    static aoa a(Context context)
    {
        return dcn.e(((gqu)hlp.a(context, gqu)).a());
    }

    static void a(Context context, cov cov, atu atu)
    {
        cov = g.a(a(context), null, Collections.emptyList(), cov, atu);
        cov.putExtra("opened_from_impression", 2148);
        context.startActivity(cov);
    }

    public cgk a()
    {
        return new cir(this);
    }

    public cgj b()
    {
        return new cis(this);
    }

    public cgh c()
    {
        return new cit(this);
    }

    public cgi d()
    {
        return new ciu(this);
    }

    public blq e()
    {
        return new civ(this);
    }
}
