// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bch
{

    private final ber a = (new bes()).a("livecamera").b("Live camera inline with the attachment area.").a(false).a();

    public bch()
    {
    }

    public bcf a(Context context)
    {
        if (a.a(context))
        {
            return new bci(this);
        } else
        {
            return null;
        }
    }

    public ber[] a()
    {
        return (new ber[] {
            a
        });
    }
}
