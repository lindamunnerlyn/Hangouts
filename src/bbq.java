// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class bbq extends hhu
    implements aur
{

    public bbq()
    {
    }

    public boolean a()
    {
        if (!g.a(dbf.e(((gmo)binder.a(gmo)).a()), apk.f))
        {
            Toast.makeText(context, g.kM, 1).show();
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
        return layoutinflater.inflate(g.lm, viewgroup, false);
    }
}
