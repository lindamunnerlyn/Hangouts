// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class bcl extends bdc
    implements aur
{

    public bcl()
    {
    }

    public boolean a()
    {
        ((ayf)binder.a(ayf)).h();
        if (!((aus)binder.a(aus)).e())
        {
            ((atb)binder.a(atb)).a(asz.d);
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
        binder.a(bch, new bcm(this));
    }
}
