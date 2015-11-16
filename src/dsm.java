// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dsm
    implements hjv
{

    final dsh a;

    dsm(dsh dsh1)
    {
        a = dsh1;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        boolean flag = false;
        boolean flag1 = g.a((Boolean)obj, false);
        dsh.b(a).a("use_local_apn_pref_key", flag1);
        hjr = dsh.d(a);
        if (!flag1)
        {
            flag = true;
        }
        due.a(hjr, flag);
        a.getActivity().finish();
        return true;
    }
}
