// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class bcg extends hmm
    implements avi
{

    public bcg()
    {
    }

    public boolean a()
    {
        if (!g.a(dcn.e(((gqu)binder.a(gqu)).a()), aqc.f))
        {
            Toast.makeText(context, g.kD, 0).show();
            return false;
        } else
        {
            return true;
        }
    }

    public void b()
    {
    }

    public boolean c()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(g.le, viewgroup, false);
    }
}
