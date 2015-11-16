// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bcl extends hmm
    implements avi
{

    private gte a;
    private final gtd b = new bcm(this);

    public bcl()
    {
    }

    static hlt a(bcl bcl1)
    {
        return bcl1.context;
    }

    public boolean a()
    {
        ((ayt)binder.a(ayt)).h();
        if (g.a(dcn.e(((gqu)binder.a(gqu)).a()), aqc.a))
        {
            g.a(dcn.e(((gqu)binder.a(gqu)).a()), 1940);
            android.content.Intent intent = ((bzi)binder.a(bzi)).a(getActivity());
            a.a(g.km, intent);
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
        a = ((gte)binder.a(gte)).a(g.km, b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }
}
