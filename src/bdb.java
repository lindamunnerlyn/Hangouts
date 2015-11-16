// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class bdb extends bds
    implements avi
{

    public bdb()
    {
    }

    public boolean a()
    {
        ((ayt)binder.a(ayt)).h();
        if (!((avj)binder.a(avj)).e())
        {
            ((atr)binder.a(atr)).a(atp.d);
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

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(bcx, new bdc(this));
    }
}
