// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class akj
    implements ajr
{

    final ai a;
    final aki b;

    akj(aki aki, ai ai1)
    {
        b = aki;
        a = ai1;
        super();
    }

    public void a(ajo ajo)
    {
        a.runOnUiThread(new akk(this, ajo));
    }
}
