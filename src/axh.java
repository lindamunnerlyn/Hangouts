// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axh
    implements asn
{

    final avv a;

    axh(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
        avv.e(a);
    }

    public void a(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        switch (axu.a[avv.f(a).ordinal()])
        {
        default:
            s = String.valueOf(avv.f(a));
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 27)).append("Unknown conversation type: ").append(s).toString());

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_161;

        case 1: // '\001'
            i = 1;
            break;
        }
_L3:
        byte byte0;
        boolean flag;
        if (!avv.g(a).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 63;
        } else
        {
            byte0 = 58;
        }
        (new cra(a.getActivity(), avv.h(a), s, flag, i, true, byte0, 0, false, false, false)).a(new Void[0]);
_L2:
        avv.e(a);
        return;
        i = 2;
          goto _L3
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            avv.d(a);
            return;
        } else
        {
            avv.e(a);
            return;
        }
    }
}
