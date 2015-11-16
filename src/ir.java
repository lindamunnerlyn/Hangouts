// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;

class ir extends iq
{

    ir()
    {
    }

    public void a(LayoutInflater layoutinflater, iv iv)
    {
        android.view.LayoutInflater.Factory factory;
        if (iv != null)
        {
            iv = new iu(iv);
        } else
        {
            iv = null;
        }
        layoutinflater.setFactory2(iv);
        factory = layoutinflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2)
        {
            h.a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
            return;
        } else
        {
            h.a(layoutinflater, iv);
            return;
        }
    }
}
