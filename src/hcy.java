// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hcy extends guy
{

    private final hda a;

    hcy(String s, hda hda1)
    {
        super(s);
        a = hda1;
    }

    protected gvv a(Context context)
    {
        try
        {
            context = hct.a(a.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new gvv(0, context, null);
        }
        return context;
    }
}
