// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class awo
    implements ary
{

    final ave a;

    awo(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
        ave.e(a);
    }

    public void a(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        switch (axh.a[ave.f(a).ordinal()])
        {
        default:
            s = String.valueOf(ave.f(a));
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
        if (!ave.g(a).a())
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
        (new cpk(a.getActivity(), ave.h(a), s, flag, i, true, byte0, 0, false, false, false)).a(new Void[0]);
_L2:
        ave.e(a);
        return;
        i = 2;
          goto _L3
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            ave.d(a);
            return;
        } else
        {
            ave.e(a);
            return;
        }
    }
}
