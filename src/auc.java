// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class auc extends cmu
{

    final boolean a;
    final String b;
    final int c;

    public auc(String s, int i, boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = "high";
        } else
        {
            s1 = "low";
        }
        super((new StringBuilder(String.valueOf(s1).length() + 20)).append("Convert to invite (").append(s1).append(")").toString());
        b = s;
        c = i;
        a = flag;
    }

    public void a()
    {
        atr.a(new aud(this));
    }
}
