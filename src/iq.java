// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;

class iq
{

    iq()
    {
    }

    public void a(LayoutInflater layoutinflater, iv iv)
    {
        if (iv != null)
        {
            iv = new it(iv);
        } else
        {
            iv = null;
        }
        layoutinflater.setFactory(iv);
    }
}
