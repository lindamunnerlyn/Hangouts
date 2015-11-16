// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bbv extends hhu
    implements aur
{

    private gow a;
    private final gov b = new bbw(this);

    public bbv()
    {
    }

    static hhb a(bbv bbv1)
    {
        return bbv1.context;
    }

    public boolean a()
    {
        ((ayf)binder.a(ayf)).h();
        if (g.a(dbf.e(((gmo)binder.a(gmo)).a()), apk.a))
        {
            g.a(dbf.e(((gmo)binder.a(gmo)).a()), 1940);
            android.content.Intent intent = ((byf)binder.a(byf)).a(getActivity());
            a.a(g.kt, intent);
        }
        return false;
    }

    public void b()
    {
    }

    public boolean c()
    {
        return true;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = ((gow)binder.a(gow)).a(g.kt, b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }
}
