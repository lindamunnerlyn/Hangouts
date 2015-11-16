// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.ColorDrawable;

public final class fqf extends ColorDrawable
{

    private int a;

    public fqf()
    {
        this((byte)0);
    }

    private fqf(byte byte0)
    {
        super(0x33000000);
    }

    public void a(int i)
    {
        a = i;
    }

    public int getIntrinsicHeight()
    {
        return a;
    }
}
