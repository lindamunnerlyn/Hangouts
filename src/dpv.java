// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dpv extends het
{

    private CharSequence b[];

    public dpv(Context context)
    {
        super(context, null);
    }

    protected void a(android.app.AlertDialog.Builder builder)
    {
        builder.setAdapter(new dpw(this, x(), g.hk, f(), b), this);
        builder.setNegativeButton(null, null);
        super.a(builder);
    }

    public void a(CharSequence acharsequence[])
    {
        b = acharsequence;
    }
}
