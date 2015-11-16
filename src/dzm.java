// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzm
    implements dxc
{

    private dzh a;

    dzm(dzh dzh1)
    {
        a = dzh1;
    }

    void a()
    {
        a = null;
    }

    public void a(dxd dxd)
    {
        if (a != null)
        {
            a.j = dxd;
            dxd = a;
            eev.e("Babel_telephony", "TeleSetupController.performNetworkQualityPrediction, trying to get network quality prediction...");
            fep.c.a(((dzh) (dxd)).h).a(new dzk(dxd));
        }
    }
}
