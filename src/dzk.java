// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzk
    implements eni
{

    final dzh a;

    dzk(dzh dzh1)
    {
        a = dzh1;
        super();
    }

    public void a(enh enh)
    {
        enh = (fes)enh;
        if (!a.k)
        {
            String s = String.valueOf(enh.b());
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 80)).append("TeleSetupController.performNetworkQualityPrediction, Predicted Network Quality: ").append(s).toString());
            a.i = enh.b();
            a.a(a.j);
        }
    }
}
