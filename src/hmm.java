// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class hmm extends hpd
    implements hls
{

    private hok a;
    public final hlp binder;
    public final hlt context = new hlt();

    public hmm()
    {
        binder = context.getBinder();
    }

    static hny a(hmm hmm1)
    {
        return hmm1.lifecycle;
    }

    public hlp getBinder()
    {
        return binder;
    }

    public Context getContext()
    {
        return context;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(context);
    }

    public void onAttach(Activity activity)
    {
        hlp hlp1 = hlp.a(activity, getParentFragment());
        context.a(activity);
        context.a(hlp1);
        binder.c(getClass().getName());
        super.onAttach(activity);
    }

    public void onAttachBinder(Bundle bundle)
    {
        binder.a(new hms(this, lifecycle));
    }

    public void onCreate(Bundle bundle)
    {
        onAttachBinder(bundle);
        for (Iterator iterator = binder.c(hmt).iterator(); iterator.hasNext(); iterator.next()) { }
        binder.a();
        a = lifecycle.a(new hmn(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        lifecycle.b(a);
        super.onDestroy();
    }
}
