// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class hmk extends hpc
    implements hls
{

    private hok aj;
    public final hlt ak = new hlt();
    public final hlp al;

    public hmk()
    {
        al = ak.getBinder();
    }

    static hny a(hmk hmk1)
    {
        return hmk1.am;
    }

    public void e(Bundle bundle)
    {
        al.a(new hms(this, am));
    }

    public hlp getBinder()
    {
        return al;
    }

    public Context getContext()
    {
        return ak;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(ak);
    }

    public void onAttach(Activity activity)
    {
        hlp hlp1 = hlp.a(activity, getParentFragment());
        ak.a(activity);
        ak.a(hlp1);
        al.c(getClass().getName());
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        e(bundle);
        for (Iterator iterator = al.c(hmt).iterator(); iterator.hasNext(); iterator.next()) { }
        al.a();
        aj = am.a(new hml(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        am.b(aj);
        super.onDestroy();
    }
}
