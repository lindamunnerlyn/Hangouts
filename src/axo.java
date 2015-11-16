// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axo
    implements azg
{

    final avv a;

    axo(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            a.getActivity().runOnUiThread(new axp(this));
            return;
        }
    }
}
