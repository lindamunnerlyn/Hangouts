// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class hjf extends hjq
    implements hls
{

    public final hlt a = new hlt();
    public final hlp b;
    private hok e;

    public hjf()
    {
        b = a.getBinder();
    }

    public void a(Bundle bundle)
    {
        b.a(new hms(this, c));
    }

    public hlp getBinder()
    {
        return b;
    }

    public Context getContext()
    {
        return a;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(a);
    }

    public void onAttach(Activity activity)
    {
        hlp hlp1 = hlp.a(activity, getParentFragment());
        a.a(activity);
        a.a(hlp1);
        c.a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle);
        for (Iterator iterator = b.c(hmt).iterator(); iterator.hasNext(); iterator.next()) { }
        b.a();
        e = c.a(new hjg(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        c.b(e);
        super.onDestroy();
    }
}
