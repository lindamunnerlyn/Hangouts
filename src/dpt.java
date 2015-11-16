// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpt
    implements hfe
{

    final dpo a;

    dpt(dpo dpo1)
    {
        a = dpo1;
        super();
    }

    public boolean a(hfa hfa, Object obj)
    {
        boolean flag = false;
        boolean flag1 = g.a((Boolean)obj, false);
        dpo.b(a).a("use_local_apn_pref_key", flag1);
        hfa = dpo.d(a);
        if (!flag1)
        {
            flag = true;
        }
        drk.a(hfa, flag);
        a.getActivity().finish();
        return true;
    }
}
