// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axa
    implements ays
{

    final ave a;

    axa(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            a.getActivity().runOnUiThread(new axb(this));
            return;
        }
    }
}
