// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bbr
{

    private final beb a = (new bec()).a("livecamera").b("Live camera inline with the attachment area.").a(false).a();

    public bbr()
    {
    }

    public bbp a(Context context)
    {
        if (a.a(context))
        {
            return new bbs(this);
        } else
        {
            return null;
        }
    }

    public beb[] a()
    {
        return (new beb[] {
            a
        });
    }
}
