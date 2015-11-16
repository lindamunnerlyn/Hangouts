// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class bmb extends ad
{

    static String a;
    private static drt b;

    public bmb()
    {
    }

    public static bmb a()
    {
        return new bmb();
    }

    static void a(bmb bmb1)
    {
        bmb1.getActivity().finish();
    }

    static void a(bmb bmb1, int i)
    {
        bg bg = bmb1.getFragmentManager().a();
        bmf bmf1 = bmf.b(i);
        bmf1.setTargetFragment(bmb1, 0);
        bmf1.a(bg, null);
    }

    static drt b()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = drs.b();
        b = bundle;
        a = drs.a(bundle);
        bundle = getFragmentManager().a();
        bmc bmc1 = bmc.q();
        bmc1.setTargetFragment(this, 0);
        bmc1.a(bundle, null);
    }
}
