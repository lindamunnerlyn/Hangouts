// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class bmk extends ad
{

    static String a;
    private static dum b;

    public bmk()
    {
    }

    public static bmk a()
    {
        return new bmk();
    }

    static void a(bmk bmk1)
    {
        bmk1.getActivity().finish();
    }

    static void a(bmk bmk1, int i)
    {
        bg bg = bmk1.getFragmentManager().a();
        bmo bmo1 = new bmo();
        Bundle bundle = new Bundle();
        bundle.putInt("action_index", i);
        bmo1.setArguments(bundle);
        bmo1.setTargetFragment(bmk1, 0);
        bmo1.a(bg, null);
    }

    static dum b()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = dul.b();
        b = bundle;
        a = dul.a(bundle);
        bundle = getFragmentManager().a();
        bml bml1 = new bml();
        bml1.setTargetFragment(this, 0);
        bml1.a(bundle, null);
    }
}
