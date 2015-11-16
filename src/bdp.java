// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bdp
{

    public static final String a = hcb.getName();
    public static final String b = ejo.getName();
    private static bdn c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new bdn();
        }
        hlp1.a(hcb, new hcb[] {
            new bdq(context)
        });
    }

    public static void a(hlp hlp1)
    {
        if (c == null)
        {
            c = new bdn();
        }
        hlp1.a(ejo, c.a());
    }

}
